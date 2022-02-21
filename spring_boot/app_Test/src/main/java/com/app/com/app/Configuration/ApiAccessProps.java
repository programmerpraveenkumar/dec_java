package com.app.com.app.Configuration;

import java.util.ArrayList;
import java.util.HashMap;

public class ApiAccessProps {

    public static boolean checkRole(String role,String api){
        try{
            HashMap<String,String> apiList = new HashMap<String,String>();
            apiList.put("getUserById","USER");
            apiList.put("getUser","ADMIN");
            return apiList.get(api).equals(role);

        }catch (Exception e){
            return false;
        }

    }
}
