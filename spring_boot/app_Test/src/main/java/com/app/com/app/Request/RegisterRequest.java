package com.app.com.app.Request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class RegisterRequest {
    @NotNull
    @Size(min=2, max=30)
    @NotBlank(message = "Email is mandatory")
    String email;

    @NotBlank(message = "RePassword is mandatory")
    String re_password;

    @NotBlank(message = "Mobile is mandatory")
    String mobile_no;

    @NotBlank(message = " Password is mandatory")
    String Password;

    @NotBlank(message = "Name is mandatory")
    String name;

    List<String> mobileNo;
    public List<String> getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(List<String> mobileNo) {
        this.mobileNo = mobileNo;
    }


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    String cityName;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getRe_password() {
        return re_password;
    }

    public void setRe_password(String re_password) {
        this.re_password = re_password;
    }


}
