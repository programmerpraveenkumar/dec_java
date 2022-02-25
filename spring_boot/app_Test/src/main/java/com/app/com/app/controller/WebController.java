package com.app.com.app.controller;


import com.app.com.app.Beans.HelloWorldConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import sun.misc.Contended;

//can be used in browser
@Controller
public class WebController {

    @GetMapping("home")
    public String getSamplePage(){
        System.out.println("this is sample home page");
        return "home_page.html";//will load from html page
    }
    @GetMapping("about")
    public String getAboutPage(){
        System.out.println("this is sample home page");
        return "about.html";//will load from html page
    }
    //localhost:8080/home
}
