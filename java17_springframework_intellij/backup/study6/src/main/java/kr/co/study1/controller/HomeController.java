package kr.co.study1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Locale locale, Model model) {
        model.addAttribute("myName", "김기태");
        return "/index";
    }
}
