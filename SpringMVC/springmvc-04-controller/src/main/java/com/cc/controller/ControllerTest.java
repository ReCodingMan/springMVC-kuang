package com.cc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 只要实现了controller接口的类，说明这就是一个控制器
 */
public class ControllerTest implements Controller {

    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();

        mv.addObject("msg", "ControllerTest");
        mv.setViewName("test");

        return mv;
    }
}
