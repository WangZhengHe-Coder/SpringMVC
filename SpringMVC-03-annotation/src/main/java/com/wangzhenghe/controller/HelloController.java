package com.wangzhenghe.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Controller是为了让Spring IOC容器初始化时自动扫描到；
    @RequestMapping是为了映射请求路径，这里因为类与方法上都有映射所以访问时应该
     是/HelloController/hello；
     方法中声明Model类型的参数是为了把Action中的数据带到视图中；
     方法返回的结果是视图的名称hello，加上配置文件中的前后缀变成WEB-INF/jsp/hello.jsp。
 */

@Controller

public class HelloController {

    //真实访问地址：项目名/HelloController/hello
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","Hello,SpringMVC!");
        return "hello";
    }
}
