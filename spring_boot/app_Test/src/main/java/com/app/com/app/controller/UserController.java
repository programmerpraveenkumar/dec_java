package com.app.com.app.controller;


import com.app.com.app.Request.LoginRequest;
import com.app.com.app.Request.RegisterRequest;
import com.app.com.app.Response.ErrorResponse;
import com.app.com.app.Response.LoginResponse;
import com.app.com.app.Service.HomeService;
import com.app.com.app.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user_ctrl")
public class UserController {
    @Autowired
    HomeService homeService;
    @Autowired
    UserService userService;


    @GetMapping("user")
    public String getUserName(){
        return "from user controller";
    }

    @GetMapping("home1")
    public String getName1(){

        return "user home 1";
    }
    @GetMapping("home2")
    public String getName2(){
        return "sample 2";
    }
    @GetMapping("home3")
    public String getName3(){
        return "sample 3";
    }
    @PostMapping("user_register_str")
    public String user_register_Str(@RequestBody String name){
        return "success "+name;
    }
//    @PostMapping("user_login")
//    public ResponseEntity user_login(@RequestBody LoginRequest req){
//        try{
//            this.userService.checkUser(req);
//            return  ResponseEntity.ok(new LoginResponse("ok..you are correct"));
//        }catch(Exception e){
//            return  ResponseEntity.badRequest().body(new LoginResponse(e.getMessage()));
//        }
//
//    }
    @PostMapping("user_update/{user_id}")
    public ResponseEntity user_update(@PathVariable String user_id,@RequestBody RegisterRequest req){
        LoginResponse res = new LoginResponse();
        try{
            System.out.println("path variable "+user_id);
            System.out.println("from request body "+req.getMobile_no());
            res.setMessage("this is update user");
            return  ResponseEntity.ok(res);//response with obj
        }catch(Exception e){
            res.setMessage(e.getMessage());
            return  ResponseEntity.badRequest().body(res);
        }
    }
    @PostMapping("user_login")
    public ResponseEntity user_login(@RequestBody LoginRequest req){
        LoginResponse res = new LoginResponse();
        try{
            System.out.println(req.getPassword().length());
            if(req.getPassword().length() >15 || req.getPassword().length() < 5){
                throw new Exception("password should min of 5 and max of 15");
            }
            this.userService.checkUser(req);
            res.setMessage("you are correct");
            return  ResponseEntity.ok("message is reponse");//response with obj

        }catch(Exception e){
            e.printStackTrace();

            ErrorResponse err = new ErrorResponse();
            err.setErrorMmessage(e.getMessage());
            return  ResponseEntity.badRequest().body(err);
        }
    }

    @PostMapping("user_register")
    public String user_register(@RequestBody RegisterRequest req){
        System.out.println(req.getEmail());
        System.out.println(req.getPassword());
        System.out.println(req.getMobile_no());
        return "success ";
    }

}
