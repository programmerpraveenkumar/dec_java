package com.test.mar_test.Configuration;

import com.test.mar_test.Response.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

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

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidationExceptions(MethodArgumentNotValidException ex) {

        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        return ResponseEntity.badRequest().body(errors);
    }

}
