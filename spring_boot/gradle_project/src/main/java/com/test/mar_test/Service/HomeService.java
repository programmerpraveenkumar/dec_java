package com.test.mar_test.Service;


import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getName(){
        return "string is from service method.";
    }

}
