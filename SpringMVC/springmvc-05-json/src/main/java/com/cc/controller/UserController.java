package com.cc.controller;

import com.alibaba.fastjson.JSON;
import com.cc.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/j1")
    //@ResponseBody//它就不会走视图解析器，直接返回一个字符串
    public String json1() throws JsonProcessingException {
        User user = new User(100, "策划个昵称", 3);
        System.out.println(user.toString());
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping("/j2")
    //@ResponseBody//它就不会走视图解析器，直接返回一个字符串
    public String json2() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();

        User user1 = new User(100, "策划个昵称", 3);
        User user2 = new User(100, "策划个昵称", 3);
        User user3 = new User(100, "策划个昵称", 3);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(userList);
        return s;
    }

    @RequestMapping("/j3")
    //@ResponseBody//它就不会走视图解析器，直接返回一个字符串
    public String json3() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Date date = new Date();

        String s = objectMapper.writeValueAsString(date);
        return s;
    }

    @RequestMapping("/j4")
    //@ResponseBody//它就不会走视图解析器，直接返回一个字符串
    public String json4() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();

        User user1 = new User(100, "策划个昵称", 3);
        User user2 = new User(100, "策划个昵称", 3);
        User user3 = new User(100, "策划个昵称", 3);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        return JSON.toJSONString(userList);
    }
}
