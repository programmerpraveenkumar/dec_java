package com.app.com.app.Configuration;

import com.app.com.app.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TokenValidationInterceptor implements HandlerInterceptor {
    @Autowired
    UserService service;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
//        String token = request.getHeader("token");
//        String user_id = request.getHeader("user_id");
//        try {
//            service.checkTokenForUserId(user_id, token);//error may throw.
//            System.out.println("Request is fine..so can go to the controller.");
//            return true;
//        } catch (Exception e) {
//            System.out.println("Exception " + e.getMessage());
//            throw new RuntimeException(e.getMessage());
//        }
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
