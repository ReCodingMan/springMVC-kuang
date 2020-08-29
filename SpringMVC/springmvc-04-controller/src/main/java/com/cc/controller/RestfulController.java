package com.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestfulController {

    /**
     * 原来方式：http://localhost:8080/add?a=1&b=2
     */
    @RequestMapping("/add")
    public String test1(int a, int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为：" + res);
        return "test";
    }

    /**
     * Restful风格：http://localhost:8080/add/1/2
     */
    @RequestMapping(value =  "/add/{a}/{b}", method = RequestMethod.GET)
    //@GetMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为：" + res);
        return "test";
    }
}
