package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

    @GetMapping("/abc")
    public String sayHello(Model model){
        model.addAttribute("msg","你好");
        return "success";
    }
}
