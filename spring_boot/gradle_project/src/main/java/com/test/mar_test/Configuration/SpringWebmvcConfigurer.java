package com.test.mar_test.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringWebmvcConfigurer implements WebMvcConfigurer {


    @Autowired
    TokenValidationInterceptor tokenValidatior;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
        System.out.println("add interceptor..");
        registry.addInterceptor(tokenValidatior);//passing the interceptor object.
    }


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        WebMvcConfigurer.super.addCorsMappings(registry);
        System.out.println("add mapping..");
          registry.addMapping("/**")
         						.allowedOrigins("*")
         						.allowedHeaders("*")
         						.allowedMethods("*")
         						.exposedHeaders("*");
    }
}
