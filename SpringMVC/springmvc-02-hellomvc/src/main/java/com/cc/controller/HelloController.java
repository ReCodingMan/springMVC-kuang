package com.cc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
        //ModelAndView 模型和视图
        ModelAndView modelAndView = new ModelAndView();

        //封装对象，放在ModelAndView中
        modelAndView.addObject("msg", "HelloSpringMVC!");

        //封装要跳转的视图，放在ModelAndView中
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
