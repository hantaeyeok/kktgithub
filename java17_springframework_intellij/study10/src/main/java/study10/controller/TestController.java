package study10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import study10.service.TestService;

@Controller
@RequestMapping("/test/*")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("getTime1.do")
    @ResponseBody
    public String getTime1() {
        return testService.getTime1();
    }
}
