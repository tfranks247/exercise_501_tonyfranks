package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        return"about";
    }

    @RequestMapping("/contactus")
    public String contactUs(){
        return "contactUs";
    }
}
