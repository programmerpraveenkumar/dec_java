package com.app.com.app.Configuration;

import com.app.com.app.Response.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice//will be catch error in the application.
public class CommonErrorHandling {

        @ExceptionHandler(RuntimeException.class)
        public ResponseEntity handlingRunTimeExcpetion(RuntimeException e){
            LoginResponse res = new LoginResponse();
            res.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(res);
        }

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity handlingArithmeticExcetpoExcpetion(ArithmeticException e){
        LoginResponse res = new LoginResponse();
        res.setMessage(e.getMessage());
        return ResponseEntity.badRequest().body(res);
    }

}
