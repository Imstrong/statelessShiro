package com.bruce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/test.html")
    public ModelAndView test(){
        return new ModelAndView("/index");
    }
    @RequestMapping("/index.html")
    public ModelAndView index(){
        return new ModelAndView("/login");
    }
}
