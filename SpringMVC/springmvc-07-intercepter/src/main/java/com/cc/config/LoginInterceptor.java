package com.cc.config;

import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 判断有没有登陆，登陆放行，否则跳转登陆页面
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        //登陆页面放行
        if (request.getRequestURI().contains("toLogin")) {
            return true;
        }
        //登陆页面放行
        if (request.getRequestURI().contains("login")) {
            return true;
        }

        if (session.getAttribute("userLoginInfo") != null) {
            return true;
        }

        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
