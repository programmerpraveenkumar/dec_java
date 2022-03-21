/*
login,register
 */
package com.test.mar_test.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TokenValidationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        //current url
        String current_url = request.getRequestURL().toString();//exclude the url from token validation for image
        //logger for print the current url
        if(current_url.contains("user_ctrl/imgRead") ||
                current_url.contains("user_ctrl/user_login") ||
                current_url.contains("user_ctrl/storeuser") ){
            //logger should be n if con
            return true;
        }
        String ContentType = request.getHeader("Content-Type");
        System.out.println("content-type "+ContentType);
        String token = request.getHeader("token");
        String user_id = request.getHeader("user_id");
        System.out.println(token);
        System.out.println(user_id);
        return true;

    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println("posthandle before sending the response");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("pre-handle after sending the response");
    }

}
