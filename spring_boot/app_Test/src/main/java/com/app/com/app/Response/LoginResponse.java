package com.app.com.app.Response;

public class LoginResponse {
    String message;
    public LoginResponse(){

    }
    public LoginResponse(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
