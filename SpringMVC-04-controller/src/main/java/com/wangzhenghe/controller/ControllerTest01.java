package com.wangzhenghe.controller;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//只要实现了Controller接口的类，说明就是一个控制器了
public class ControllerTest01 {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","ControllerTest");
        mv.setViewName("test");
        return mv;
    }
}
