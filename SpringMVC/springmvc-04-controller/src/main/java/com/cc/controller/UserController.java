package com.cc.controller;

import com.cc.pojo.User;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model) {
        //1、接受前端参数
        System.out.println("接口到前端参数为" + name);

        //2、将返回的结果传递给前端
        model.addAttribute("msg", name);

        //3、视图跳转
        return "test";
    }

    /**
     * 前端接受一个对象
     */
    @RequestMapping("/t2")
    public String test2(User user) {
        //1、接受前端参数
        System.out.println(user);

        //3、视图跳转
        return "test";
    }

    @RequestMapping("/t3")
    public String test3(ModelMap map) {
        //3、视图跳转
        return "test";
    }
}
