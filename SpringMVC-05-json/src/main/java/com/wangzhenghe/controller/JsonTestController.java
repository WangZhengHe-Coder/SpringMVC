package com.wangzhenghe.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wangzhenghe.pojo.User;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class JsonTestController {

    //String格式
    @RequestMapping("/json1")
    @ResponseBody
    public String json1(){
        User user = new User("马云", 12, "男");
        return user.toString();
    }

    //json格式
    @RequestMapping("/json2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("马云", 12, "男");
        //将我们的对象解析成Json格式
        String string = mapper.writeValueAsString(user);
        return string;
    }
}
