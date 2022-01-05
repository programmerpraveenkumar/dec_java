package com.app.com.app.Service;

import com.app.com.app.Request.LoginRequest;
import com.app.com.app.Response.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean checkUser(LoginRequest req)throws Exception{
        if(req.getEmail().equals("admin@gmail.com") && req.getPassword().equals("admin")){
            return  true;
        }else{
            throw new Exception("please provide proper username and password");
        }
    }

}
