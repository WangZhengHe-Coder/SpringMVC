package com.wangzhenghe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fumulu")
public class ControllerTest03 {

    @RequestMapping("/zimulu")
    public String test03(Model model){
        model.addAttribute("msg","我的第三种测试");
        return "hello";
    }
}
