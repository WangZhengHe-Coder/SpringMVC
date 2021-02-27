package com.wangzhenghe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncodingController {

    @GetMapping("/e/t1")
    public String test(Model model){
        model.addAttribute("msg","王正贺");
        return "test";
    }
}
