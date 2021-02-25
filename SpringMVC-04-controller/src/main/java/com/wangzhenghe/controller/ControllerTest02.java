package com.wangzhenghe.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControllerTest02 {

    @RequestMapping("/woqwoqwq")//在地址栏上最终输入的路径为：http://localhost:8080/woqwoqwq
    public String test01(Model model){

        model.addAttribute("msg","我的第一种测试！");
        return "hello";//转换成：WEB-INF/jsp/hello.jsp，返回的页面就是hello.jsp
    }

    @RequestMapping("/asasaaa")
    public String test02(Model model){

        model.addAttribute("msg","我的第二种测试");
        return "hello";
    }
}
