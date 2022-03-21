package com.app.com.app.Configuration;

import com.sun.tools.javac.util.List;
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
        registry.addInterceptor(tokenValidatior);//passing the interceptor object.
    }

//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:4200")
//                .allowCredentials(true)
//                .allowedHeaders("token", "Cache-Control", "Content-Type","user_id")
//                .exposedHeaders("*")
//                .allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH","OPTIONS");;
//    }
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        WebMvcConfigurer.super.addCorsMappings(registry);
        //registry.addMapping("/**").allowedHeaders("*").allowedMethods("*").allowedOrigins("*");

          registry.addMapping("/**")
         						.allowedOrigins("*")
         						.allowedHeaders("*")
         						.allowedMethods("*")
         						.exposedHeaders("*");
    }
}
