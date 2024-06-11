package kr.ed.haebeop.controller;

import kr.ed.haebeop.domain.Human;
import kr.ed.haebeop.domain.TestVO;
import kr.ed.haebeop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ajax")
public class AjaxController {

    @Autowired
    private TestService testService3;

    @GetMapping("/")
    public String ajaxHome() { return "/ajax/home"; }

    @GetMapping("/test1")
    public String ajaxTest1() { return "/ajax/test1"; }

    @GetMapping("/test1pro")
    public String ajaxTest1Pro() {
        System.out.println("GET 전송 테스트");
        return "/ajax/test1";
    }

    @GetMapping("/test2")
    public String ajaxTest2() { return "/ajax/test2"; }

    @PostMapping("/test2pro")
    public String ajaxTest2Pro() {
        System.out.println("Post 전송 테스트");
        return "/ajax/test2";
    }

    @GetMapping("/test3")
    public String ajaxTest3() {
        return "/ajax/test3";
    }

    @GetMapping("/test3pro")
    public String ajaxTest3Pro(@RequestParam("msg") String msg) {
        System.out.println(msg);
        return "/ajax/test3";
    }

    @GetMapping("/test4")
    public String ajaxTest4() {
        return "/ajax/test4";
    }

    @PostMapping("/test4pro")
    public String ajaxTest4Pro(@RequestParam("msg") String msg) {
        System.out.println(msg);
        return "/ajax/test4";
    }

    @GetMapping("/test5")
    public String ajaxTest5() {
        return "/ajax/test5";
    }

    @GetMapping("/test5pro")
    @ResponseBody
    public Human ajaxTest5Pro(@ModelAttribute("human") Human human) {
        System.out.println(human.toString());
        return human;
    }

    @GetMapping("/test6")
    public String ajaxTest6() {
        return "/ajax/test6";
    }

    @PostMapping("/test6pro")
    @ResponseBody
    public Human ajaxTest6Pro(@ModelAttribute("human") Human human) {
        System.out.println(human.toString());
        return human;
    }

    @GetMapping("/test7")
    public String ajaxTest7() {
        return "/ajax/test7";
    }
    @PostMapping("/test7pro")
    @ResponseBody
    public Human ajaxTest7Pro(@RequestBody Human human) {
        System.out.println(human.toString());
        return human;
    }

    @GetMapping("/test8")
    public String ajaxTest8() {
        return "/ajax/test8";
    }
    @PostMapping("/test8pro")
    @ResponseBody
    public List<TestVO> ajaxTest8Pro(@RequestBody TestVO test) throws Exception {
        System.out.println(test.toString());
        testService3.testInsert(test);
        List<TestVO> tList = testService3.testList();
        return tList;
    }

    @GetMapping("/test9")
    public String ajaxTest9() {
        return "/ajax/test9";
    }

    @PostMapping("/test9pro")
    public ResponseEntity ajaxTest9Pro(@RequestBody TestVO test) throws Exception {
        System.out.println(test.toString());
        return new ResponseEntity<>(test, HttpStatus.OK);
    }

    @GetMapping("/test10")
    public String ajaxTest10() {
        return "/ajax/test10";
    }

    @PostMapping("/test10pro")
    public ResponseEntity ajaxTest10Pro(@RequestBody TestVO test) throws Exception {
        testService3.testInsert(test);
        List<TestVO> tList = testService3.testList();
        return new ResponseEntity<>(tList, HttpStatus.OK);
    }
}
