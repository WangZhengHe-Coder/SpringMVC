package com.wangzhenghe.controller;

import com.wangzhenghe.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    //test01中的参数与访问地址中的参数一致时
    //访问地址：localhost：8080/user/t1?name=xxx;
    @GetMapping("/t1")
    public String test01(String name, Model model){
        //1.接收前端参数
        System.out.println("接收到前端的参数为："+name);
        //2.将返回的结果传递给前端
        model.addAttribute("msg",name);
        return "test";
    }

    //test02中的参数与访问地址中的参数不一致时
    //访问地址：localhost：8080/user/t1?name=xxx;
    @GetMapping("/t2")
    public String test02( @RequestParam("name") String username, Model model){
        //1.接收前端参数
        System.out.println("接收到前端的参数为："+username);
        //2.将返回的结果传递给前端
        model.addAttribute("msg",username);
        return "test";
    }

    //test03中的参数是一个对象，而访问地址中的返回的参数是对象的字段
    //访问地址：localhost：8080/user/t3?name=xxx&id=12&password=12121222121;
    //1.接收前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用
    //2.假设传递的是一个对象User，匹配User对象中的字段名：如果名字一致则OK，否则，匹配不到
    @GetMapping("/t3")
    public String test03(User user, Model model){
        //1.接收前端参数
        System.out.println("接收到前端的参数为："+user);
        //2.将返回的结果传递给前端
        model.addAttribute("msg",user);
        return "test";
    }
}
