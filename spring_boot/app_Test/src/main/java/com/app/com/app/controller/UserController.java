package com.app.com.app.controller;


import com.app.com.app.Request.LoginRequest;
import com.app.com.app.Request.RegisterRequest;
import com.app.com.app.Response.ErrorResponse;
import com.app.com.app.Response.LoginResponse;
import com.app.com.app.Service.HomeService;
import com.app.com.app.Service.UserService;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;//file upload

import javax.validation.Valid;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("user_ctrl")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    String UPLOADED_FOLDER = "/Volumes/softwares/upload_folder/jan-sp-boot/";//folder path to store the  file
    @Autowired
    HomeService homeService;
    @Autowired
    UserService userService;
    @Autowired
    Environment env;


    @GetMapping("user")
    public String getUserName(@RequestHeader String token){
        //if header is empty .will throw the error..else will return success reseponse
        System.out.println("user token is "+token);
        return "from user controller";
    }


    @GetMapping("home1")
    public String getName1(){

        return "user home 1";
    }
    @GetMapping("home2")
    public String getName2(){
        return "sample 2";
    }
    @GetMapping("home3")
    public String getName3(){
        return "sample 3";
    }
    @PostMapping("user_register_str")
    public ResponseEntity user_register_Str(@RequestBody String name){
        try{
            // userService.checkTokenForUserId(user_id,token);
            return ResponseEntity.ok("success flow");
        }catch (Exception e){
            return  ResponseEntity.badRequest().body(e.getMessage());//response with obj

        }
    }
    @PostMapping("uploadFile")
    public ResponseEntity uploadFile(@RequestParam MultipartFile file,@RequestParam Integer userId){
        try{
            String fileName = file.getOriginalFilename();
            String folderWithName = UPLOADED_FOLDER+fileName;
            Path path = Paths.get(folderWithName);//set path with filename
//            File f = new File(""+UPLOADED_FOLDER+fileName);
//            if(f.exists()){
//                fileName = fileName+"(1)";
//                path = Paths.get(UPLOADED_FOLDER +fileName);//set path with filename
//            }
            Files.write(path, file.getBytes());//write the file in the location
            //update query against the user_id with name
            userService.uploadPicture(fileName,userId);
            return ResponseEntity.ok("upload success "+file.getOriginalFilename());//return the file name
        }catch (Exception e){
            return  ResponseEntity.badRequest().body(e.getMessage());//response with obj
        }
    }
    @PostMapping("uploadMutliFile")
    public ResponseEntity uploadFiles(@RequestParam MultipartFile[] file,@RequestParam Integer userId){
        try{
            /*
                  mypic.jpg
             */
            for(MultipartFile f:file){
                String fileName = f.getOriginalFilename();
            String folderWithName = UPLOADED_FOLDER+fileName;
            Path path = Paths.get(folderWithName);//set path with filename
            Files.write(path, f.getBytes());//write the file in the location
        }
            return ResponseEntity.ok("upload success Total files"+file.length);//return the file name

        }catch (Exception e){
            return  ResponseEntity.badRequest().body(e.getMessage());//response with obj
        }
    }

/*
application/pdf
image/jpg
image/png
application/xls
 */
    //below method will return the image as jpeg
    @GetMapping(value="imgRead/{name}",produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] readImg(@PathVariable String name){
        try{

            //calling service for getting the name from the database using the userId
            String fileWIthPath = UPLOADED_FOLDER+name;
            File file = new File(fileWIthPath);
            if(!file.exists()){
                fileWIthPath = UPLOADED_FOLDER+"no_img.png";
            }
            InputStream in = new FileInputStream(fileWIthPath);
            return IOUtils.toByteArray(in);
        }catch (Exception e){
            return null;
        }
    }
//    @PostMapping("user_login")
//    public ResponseEntity user_login(@RequestBody LoginRequest req){
//        try{
//            this.userService.checkUser(req);
//            return  ResponseEntity.ok(new LoginResponse("ok..you are correct"));
//        }catch(Exception e){
//            return  ResponseEntity.badRequest().body(new LoginResponse(e.getMessage()));
//        }
//
//    }

    @GetMapping("searchUser")
    public ResponseEntity searchUser(@RequestParam(required = false) String name,
                                     @RequestParam(required = false) String email){
        try{
            return  ResponseEntity.ok(this.userService.searchUser(name,email));
        }catch(Exception e){
            e.printStackTrace();
            return  ResponseEntity.badRequest().body(new LoginResponse(e.getMessage()));
        }

    }

    @PostMapping("user_update/{user_id}")
    public ResponseEntity user_update(@PathVariable String user_id,
                                      @Valid @RequestBody RegisterRequest req,
                                      @RequestHeader("user_id") String user_id_header){
        LoginResponse res = new LoginResponse();
        try{
            if(user_id.equals(user_id_header)){
                System.out.println("path variable "+user_id);
                System.out.println("from request body "+req.getMobile_no());
                res.setMessage("this is update user");
                return  ResponseEntity.ok(res);//response with obj
            }else{
                throw new Exception("Dont have access to the api.");
            }

        }catch(Exception e){
            res.setMessage(e.getMessage());
            return  ResponseEntity.badRequest().body(res);
        }
    }
//    @GetMapping("generate_token")
//    public ResponseEntity user_login(@RequestBody String str){
//        return ResponseEntity.ok(this.userService.getToken(str));
//    }
    @PostMapping("user_login")
    public ResponseEntity user_login(@RequestBody LoginRequest req){
        LoginResponse res = new LoginResponse();
        try{
            System.out.println(req.getPassword().length());
            if(req.getPassword().length() >15 || req.getPassword().length() < 5){
                throw new Exception("password should min of 5 and max of 15");
            }
            this.userService.checkUser(req);
            //this.userService.checkUser(req.getEmail(),req.getPassword());
            res.setMessage("you are correct");
            return  ResponseEntity.ok("message is reponse");//response with obj

        }catch(Exception e){
            e.printStackTrace();

            ErrorResponse err = new ErrorResponse();
            err.setErrorMmessage(e.getMessage());
            return  ResponseEntity.badRequest().body(err);
        }
    }

    @PostMapping("user_register")
    public String user_register(@RequestBody RegisterRequest req){
        System.out.println(req.getEmail());
        System.out.println(req.getPassword());
        System.out.println(req.getMobile_no());
        return "success ";
    }

    //get all data from database
    @GetMapping("getUser")
    public ResponseEntity getUser(){
        try{
           // userService.checkTokenForUserId(user_id,token);
            return ResponseEntity.ok(this.userService.getUserFromUserTable());
        }catch (Exception e){
            return  ResponseEntity.badRequest().body(e.getMessage());//response with obj

        }
        //how to verfiy the token.?

    }

    @GetMapping("getUserById/{user_id}")
    public ResponseEntity getUser(@PathVariable Integer user_id){
        logger.info("IN ");
        try{
            //counry check from the props

            logger.info("OUT ");
            return ResponseEntity.ok(this.userService.getUserById(user_id));
        }catch (Exception e){
            logger.info("ERROR {} ",e.getMessage());
            throw new RuntimeException(e.getMessage());
//            LoginResponse res = new LoginResponse();
//            res.setMessage(e.getMessage());//error will come from service class
//            return ResponseEntity.badRequest().body(res);//failure response with 400 status code
        }

    }



    @PostMapping("multi_store_user")
    public ResponseEntity user_register(@RequestBody List<RegisterRequest> reqList){
        LoginResponse res = new LoginResponse();
        try{
            //iterating the multiple data
            for(RegisterRequest req:reqList){
                //can get single object;
                this.userService.storeUser(req);
            }
            res.setMessage(reqList.size()+"stored successfully");

            return ResponseEntity.ok(res);
        }catch(Exception e){
            res.setMessage(e.getMessage());
            return  ResponseEntity.badRequest().body(res);
        }
    }
    @PostMapping("logout/{user_id}")
    public ResponseEntity logout(@PathVariable Integer user_id ){
        //as this controller is for logout,sending the token as empty.
        userService.userUpdateToken("",user_id);
        return ResponseEntity.ok("logout success");
    }
    //store the data in the database
    @PostMapping("storeuser")
    public ResponseEntity storeUser(@RequestBody RegisterRequest req){
        LoginResponse res = new LoginResponse();
        try{
            this.userService.storeUser(req);
            res.setMessage("inserted successfully");
            return ResponseEntity.ok(res);//success reponse with 200 status code
        }catch(Exception e){
            e.printStackTrace();
            res.setMessage("Error while insert");
            return ResponseEntity.badRequest().body(res);//failure response with 400 status code
        }
    }
    @PostMapping("multistoreuser")
    public ResponseEntity storeUser(@RequestBody List<RegisterRequest> req){
        LoginResponse res = new LoginResponse();
        try{
            this.userService.storeUser(req);
            res.setMessage("inserted successfully");
            return ResponseEntity.ok(res);//success reponse with 200 status code
        }catch(Exception e){
            e.printStackTrace();
            res.setMessage("Error while insert");
            return ResponseEntity.badRequest().body(res);//failure response with 400 status code
        }
    }


    @GetMapping("getCountry")
    public String getCountryFromProps(){
        System.out.println(env.getProperty("COUNTRY_CODE"));
        logger.info(env.getProperty("COUNTRY_CODE"));
        String con_code = env.getProperty("COUNTRY_CODE");
        if(con_code.equals("IND")){
            return  "Rs";
        }else if(con_code.equals("UK")){
            return "$";
        }else{
            return "$";
        }
    }

}
