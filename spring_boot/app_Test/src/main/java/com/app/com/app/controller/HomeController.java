package com.app.com.app.controller;


import com.app.com.app.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
requestparam -> get and post
requestbody->POST
pathvairable->get and post
 */
@RestController
@RequestMapping("home_ctrl")
public class HomeController {
    //DI
    @Autowired
    HomeService homeService;

    //for process the get method
    @GetMapping("home")
    public String getName(@RequestParam int name,@RequestParam String email){
        System.out.println(email);
        return this.homeService.getName()+"--get--"+name;
    }
    @PostMapping("home")
    public String postName(@RequestParam String name){
        return this.homeService.getName()+"--post"+name;

    }
    @GetMapping("home1")
    public String getName1(){

        return "home ctrl 1";
    }

    @GetMapping("home2/{email}")
    public String getName2(@PathVariable String email){
        System.out.println(email);
        return email;
    }


    @GetMapping("home3")
    public String getName3(@RequestParam String name,@RequestParam String email){
        System.out.println(email);
        return this.homeService.getName()+"--get--"+name;
    }





}
