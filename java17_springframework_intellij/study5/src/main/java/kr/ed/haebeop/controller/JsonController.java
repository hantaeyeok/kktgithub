package kr.ed.haebeop.controller;

import kr.ed.haebeop.domain.TestVO;
import kr.ed.haebeop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/json/")
public class JsonController {

    @Autowired
    private TestService testService3;

    //GET
    @GetMapping("getTest/{num}")
    @ResponseBody
    public TestVO viewTest(@PathVariable int num) throws Exception {
        TestVO test = testService3.getTest(num);
        return test;
    }

    @GetMapping("insertForm")
    public String insertForm(Model model) throws Exception {
        return "/test/testInsert";
    }

    //POST
    @PostMapping("insertForm")
    @ResponseBody //@ModelAttribute TestVO test = 일반 객체로 받아오기
    public TestVO insertPro(@ModelAttribute TestVO test) throws Exception{
        testService3.testInsert(test);
        return test;        //@RequestParam("num") int num, @RequestParam("title") int title
    }

    @GetMapping("insertForm2")
    public String insertForm2(Model model) throws Exception {
        return "/test/testInsert2";
    }

    //POST
    @PostMapping("insertForm2")
    @ResponseBody //@RequestBody = json객체으로 값 받아오기
    public TestVO insertPro2(@RequestBody TestVO test) throws Exception{
        testService3.testInsert(test);
        return test;
    }
}
