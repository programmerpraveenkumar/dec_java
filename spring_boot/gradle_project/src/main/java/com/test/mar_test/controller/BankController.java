package com.test.mar_test.controller;

import com.test.mar_test.Response.LoginResponse;
import com.test.mar_test.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class BankController {
    @Autowired
    UserService userService;

    @GetMapping("getBalanceUser")
    public ResponseEntity getTotal(){
        try{
            return ResponseEntity.ok(this.userService.getBalance());
        }catch (Exception e){
            LoginResponse res = new LoginResponse();
            res.setMessage(e.getMessage());//error will come from service class
            return ResponseEntity.badRequest().body(res);//failure response with 400 status code
        }
    }
   // @GetMapping("getBankDetails")
//    public ResponseEntity getBankDetails(){
//        try {
//            BankResponse res = new BankResponse();
//            res.setTotal();//getBalance from service
//            res.setCredit();//getCreditBalacnef rom service
//            res.setDebit();//getDEbitBalancerom service
//            return ResponseEntity.ok(res);
//        }catch (Exception e){
//            LoginResponse res = new LoginResponse();
//            res.setMessage(e.getMessage());//error will come from service class
//            return ResponseEntity.badRequest().body(res);//failure response with 400 status code
//        }
    }
