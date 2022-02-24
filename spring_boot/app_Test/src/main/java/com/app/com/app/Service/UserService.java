package com.app.com.app.Service;

import com.app.com.app.Model.CityModel;
import com.app.com.app.Model.MobileModel;
import com.app.com.app.Model.UserModel;
import com.app.com.app.Repo.CityRepo;
import com.app.com.app.Repo.UserRepo;
import com.app.com.app.Request.LoginRequest;
import com.app.com.app.Request.RegisterRequest;
import com.app.com.app.Response.LoginResponse;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.*;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserRepo userRepo;//DI for the repo
    @Autowired
    CityRepo cityRepo;//DI for the repo

    @Autowired
    Environment env;

    @Autowired
    EntityManager em;

    public boolean checkUser(LoginRequest req)throws Exception{
        if(req.getEmail().equals("admin@gmail.com") && req.getPassword().equals("admin")){
            return  true;
        }else{
            throw new Exception("please provide proper username and password");
        }
    }

//    private String getToken(String email){
//        String token = email+System.currentTimeMillis();//adding the current time
//        String res  = Base64.getEncoder().encodeToString(token.getBytes());//convert string to bytes for encode
//        return res;
//    }
    public String tokenGenerate(String email,String name) {
        System.out.println(env.getProperty("JWT_TOKEN_SECRET"));
        Calendar c= Calendar.getInstance();
        c.add(Calendar.MINUTE,1);
        Date date = c.getTime();
//        Claims claim =
        String token = Jwts.builder()
                .setSubject(name)
                .setIssuer(email)
                .setExpiration(date)
                .signWith(SignatureAlgorithm.HS512, env.getProperty("JWT_TOKEN_SECRET")).compact();
        return token;
    }
    public Boolean tokenDecode(String token)throws Exception{
        try{
            Jws<Claims> jwt = Jwts.parser()
                    .setSigningKey(env.getProperty("JWT_TOKEN_SECRET"))
                    .parseClaimsJws(token);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return true;
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


    @Cacheable(cacheNames="user", key="#id")
    public UserModel getUserById(Integer id)throws Exception{
        System.out.println("inside get User By id");
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
            logger.info("token is null {}"+token);
            System.out.println("token is null..so it will not go to the controller.");
            throw new Exception("Token is null");
            //return false;//http request will be stopped here.
        }
        else if(userId == null || userId.equals("")){
            logger.info("user_id is null {}"+token);
            System.out.println("token is null..so it will not go to the controller.");
            throw new Exception("User ID is null");
            //return false;//http request will be stopped here.
        }
        Integer user_id_int = Integer.parseInt(userId);//string to int
        //IMPL1
        //getTokenByUserId
    ///implemnet the cache
        userRepo.getTokenByUserId(user_id_int,token).orElseThrow(()->new Exception("Token is not valid for this user"));
        logger.info("ok for token validation {}"+token);
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

    public String getRole(String UserId){
            //get role by UserId;
        return null;
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
    public Boolean storeUser(List<RegisterRequest> req) throws  Exception{
        try{
            List<UserModel> userModelList = new ArrayList<UserModel>();//ref of user Table
            req.stream().forEach(
                    obj->{
                        try {
                            UserModel userModel = new UserModel();
                            userModel.setCity(this.createOrReturnCity(obj.getCityName()));//one to one
                            userModel.setName(obj.getName());
                            userModel.setEmail(obj.getEmail());
                            userModel.setPassword(obj.getPassword());
                            userModelList.add(userModel);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
            );
            System.out.println(userModelList.size()+" going to insert ");
            this.userRepo.saveAll(userModelList);//insert multiple data.
        }catch (Exception e){
            e.printStackTrace();
            throw  e;
        }

        return true;//success sql
    }
    public Boolean storeUserWithMobile(List<RegisterRequest> req) throws  Exception{
        try{
            List<UserModel> userModelList = new ArrayList<UserModel>();//ref of user Table
            req.stream().forEach(
                    obj->{
                        try {
                            UserModel userModel = new UserModel();
                            userModel.setCity(this.createOrReturnCity(obj.getCityName()));//one to one
                            userModel.setName(obj.getName());
                            userModel.setEmail(obj.getEmail());
                            userModel.setPassword(obj.getPassword());
                            //userModel.setMobile(createMobileModelWithRequst(obj.getMobileNo());//argument is list
                            userModelList.add(userModel);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
            );
            System.out.println(userModelList.size()+" going to insert ");
            this.userRepo.saveAll(userModelList);//insert multiple data.
        }catch (Exception e){
            e.printStackTrace();
            throw  e;
        }

        return true;//success sql
    }

    private List<MobileModel> createMobileModelWithRequst(List<String> mobileReq){
        List<MobileModel> listMOdel = new ArrayList<>();
        //convert the request to mobile model
        mobileReq.stream().forEach((o)->{
                            MobileModel mobileModel  = new MobileModel();
                            mobileModel.setMobile_no(o);
                            listMOdel.add(mobileModel);
                       }
                    );
        return listMOdel;
    }

    private CityModel createOrReturnCity(String name) throws Exception{
        Optional<CityModel> cityModel = cityRepo.getCityByName(name);
        if(cityModel.isPresent()){
            return  cityModel.get();
        }else{
            System.out.println("city is not present.so creating new");
            CityModel city = new CityModel();
            city.setName(name);
            cityRepo.save(city);
            return  city;
        }
    }
/*
select * from user where  name = :name
select * from user where   name = :name and mobile = :mobile
select * from user where  name = :name and age >25
select * from user where  age >25
 */
    public List<UserModel> searchUser(String req_name,String req_email){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<UserModel> cr = cb.createQuery(UserModel.class);
            //req_email.equals("")
        Root<UserModel> userModel = cr.from(UserModel.class);//get the class from criteriaquery
        List<Predicate> predicates = new ArrayList<>();//to search the list

        if(req_name!= null && !req_name.equals("")){//if not empty and not null  add below query
            //predicates.add(cb.equal(userModel.get("name"), req_name));//name is column name in the model.
            predicates.add(cb.like(userModel.get("name"), req_name+"%"));
        }
        if(req_email != null && !req_email.equals("")){//if not empty and not null add below query
            predicates.add(cb.equal(userModel.get("email"), req_email));//name is column name in the model.
        }


//        if(balance > 0){
//            //below queyr will add only when there is balance.
//            predicates.add(cb.lessThan(userModel.get("balance"),balance));//yyy-mm--dd
//        }

        cr.where(predicates.toArray(new Predicate[0]));//add predicates with where condition



        return em.createQuery(cr).getResultList();//execute query and get the list
    }
}
