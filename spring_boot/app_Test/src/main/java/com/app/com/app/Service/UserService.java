package com.app.com.app.Service;

import com.app.com.app.Model.UserModel;
import com.app.com.app.Repo.UserRepo;
import com.app.com.app.Request.LoginRequest;
import com.app.com.app.Request.RegisterRequest;
import com.app.com.app.Response.LoginResponse;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserRepo userRepo;//DI for the repo
    public boolean checkUser(LoginRequest req)throws Exception{
        if(req.getEmail().equals("admin@gmail.com") && req.getPassword().equals("admin")){
            return  true;
        }else{
            throw new Exception("please provide proper username and password");
        }
    }

    private String getToken(String email){
        String token = email+System.currentTimeMillis();//adding the current time
        String res  = Base64.getEncoder().encodeToString(token.getBytes());//convert string to bytes for encode
        return res;
    }

    public boolean checkUser(String email,String password)throws Exception{
        if(email.equals("admin@gmail.com") && password.equals("admin")){
            return  true;
        }else{
            throw new Exception("please provide proper username and password");
        }
    }

    public List<UserModel> getUserFromUserTable(){
        //below return list from usertable
       List<UserModel> userList = this.userRepo.findAll();//get all the data from the table.
        return userList;
    }

    public Integer getBalance(){
        //below return list from usertable
        List<UserModel> userList = this.userRepo.findAll();//get all the data from the table.
        int total =0;///init
        for(UserModel um:userList){
            total = total+um.getBalance();
        }
        System.out.println("total "+total);
        return  total;
    }

    public Integer getBalanceCredit(){
//        //below return list from usertable
//        List<UserModel> userList = this.userRepo.getCreditData();//get all the data from the table.
//        int total =0;///init
//        for(UserModel um:userList){
//            total = total+um.getBalance();
//        }
//        System.out.println("total "+total);
//        return  total;
        return 0;
    }

    public void uploadPicture(String picName,Integer userId){
        userRepo.updatePictureUserId(userId,picName);
    }

    public UserModel getUserById(Integer id)throws Exception{
        //optional will check for null exception.(JAVA 8)
        logger.info("in-service");
        Optional<UserModel> user = this.userRepo.findById(id);//get user by ID(PK)
        if(user.isPresent()){
            logger.info("OUT");
            return user.get();//get the data from optional -- java8
        }else{
            logger.error("Error is not found {}",id);
            //throw if user is not found with id
            throw new Exception("User is not found");
        }
    }

    public Boolean userUpdateToken(String token,Integer userId){
        try{
            userRepo.updateTokenByUserId(userId,token);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            //print the error
            return false;
        }
    }
    public Boolean checkTokenForUserId(int userId,String token)throws Exception{

        //IMPL1
        //getTokenByUserId
        userRepo.getTokenByUserId(userId,token).orElseThrow(()->new Exception("token is not valid"));
        return true;

        //IMPL2
        //UserModel um = userRepo.getTokenByUserId(userId,token).orElseThrow(()->new Exception("token is not valid""));


//IMPL3
//        Optional<UserModel> um = userRepo.getTokenByUserId(userId,token);
//        if(um.isPresent()){
//            return true;
//        }else{
//           throw new Exception("Token is not found")
//        }

    }
    public Boolean checkTokenForUserId(String userId,String token)throws Exception{

        if(token == null || token.equals("")){
            System.out.println("token is null..so it will not go to the controller.");
            throw new Exception("Token is null");
            //return false;//http request will be stopped here.
        }
        else if(userId == null || userId.equals("")){
            System.out.println("token is null..so it will not go to the controller.");
            throw new Exception("User ID is null");
            //return false;//http request will be stopped here.
        }
        Integer user_id_int = Integer.parseInt(userId);//string to int
        //IMPL1
        //getTokenByUserId
        userRepo.getTokenByUserId(user_id_int,token).orElseThrow(()->new Exception("Token is not valid for this user"));
        return true;

        //IMPL2
        //UserModel um = userRepo.getTokenByUserId(userId,token).orElseThrow(()->new Exception("token is not valid""));


//IMPL3
//        Optional<UserModel> um = userRepo.getTokenByUserId(userId,token);
//        if(um.isPresent()){
//            return true;
//        }else{
//           throw new Exception("Token is not found")
//        }

    }




    public Boolean storeUser(RegisterRequest req){

        //if mail is already exist in the databse..shoud not store the data.

        UserModel userModel = new UserModel();//ref of user Table
        userModel.setName(req.getName());
        userModel.setEmail(req.getEmail());
        userModel.setPassword(req.getPassword());
//        this.userRepo.save(userModel);//store the data in the database.
//        UserModel userModel = new UserModel();//ref of user Table
//        userModel.setName("testname");
//        userModel.setEmail("email");
//        userModel.setPassword("sample password");
        this.userRepo.save(userModel);//store the data in the database.
        return true;//success sql
    }
}
