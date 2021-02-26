package com.wangzhenghe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest {
    //关闭视图解析器后的重定向
    @RequestMapping("/m1/t1")
    public String test01(Model model){
        //重定向
        model.addAttribute("msg","ModelTest01");
        return "redirect:/index.jsp";
    }
}
