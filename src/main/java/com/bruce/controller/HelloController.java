package com.bruce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/test")
    public String test(){
        return "/index";
    }
    @RequestMapping("/")
    public String index(){
        return "/index";
    }
}
