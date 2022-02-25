package com.app.com.app.Service;

import com.app.com.app.Model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserServiceInt {
    public List<UserModel> searchUser(String req_name, String req_email);
}
