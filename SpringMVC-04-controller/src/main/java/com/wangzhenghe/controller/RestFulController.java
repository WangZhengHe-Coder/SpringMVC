package com.wangzhenghe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {



    /**
     * 原来的老方式
     * 测试：http://localhost:8080/add?p1=2&p2=3 --> 结果为：5
     * @param p1
     * @param p2
     * @param model
     * @return
     */
    //映射访问路径
    @RequestMapping("/add")
    public String test01(int p1,int p2,Model model){
        int res = p1 + p2;
        model.addAttribute("msg","结果为："+res);
        return "test";
    }

    /**
     * 现在的RestFul方式
     * 测试：http://localhost:8080/add/3/7 --> 结果为：10
     * @param p1
     * @param p2
     * @param model
     * @return
     */
//    //映射访问路径
//    @RequestMapping("/add/{p1}/{p2}")
//    public String test02(@PathVariable int p1,@PathVariable int p2,Model model){
//        int res = p1 + p2;
//        model.addAttribute("msg","结果为："+res);
//        return "test";
//    }

    /**
     * 现在的RestFul方式
     * 测试：http://localhost:8080/add/3/0 --> 结果为：3
     * @param p1
     * @param p2
     * @param model
     * @return
     */
    //映射访问路径
    //@RequestMapping(name ="/add/{p1}/{p2}",method = RequestMethod.GET)
    @GetMapping("/add/{p1}/{p2}")
    public String test03(@PathVariable int p1,@PathVariable int p2,Model model){
        int res = p1 + p2;
        model.addAttribute("msg","结果为："+res);
        return "test";
    }

    /**
     * 现在的RestFul方式
     * 测试：http://localhost:8080/add/3/0 --> 结果为：3
     * @param p1
     * @param p2
     * @param model
     * @return
     */
    //映射访问路径
    //@RequestMapping(name ="/add/{p1}/{p2}",method = RequestMethod.GET)
    @PostMapping("/add/{p1}/{p2}")
    public String test04(@PathVariable int p1,@PathVariable int p2,Model model){
        int res = p1 * p2;
        model.addAttribute("msg","结果为："+res);
        return "test";
    }

}
