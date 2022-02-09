package com.app.com.app.Model;
/*
dont use primitive datatyps for error.
 */


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user")//value comes from the mysql table name
public class UserModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;

    String password,email,name,dob;
    Integer balance;
    String token;

    @Column(updatable=false,insertable = false)//no insert and update for this column
    String insert_date;

    //Integer city_id;

    public CityModel getCity() {
        return city;
    }

    public void setCity(CityModel city) {
        this.city = city;
    }

    @OneToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    CityModel city;

    public List<MobileModel> getMobile() {
        return mobile;
    }

    public void setMobile(List<MobileModel> mobile) {
        this.mobile = mobile;
    }

    @OneToMany
    @JoinColumn(name = "user_id")
    List<MobileModel> mobile;

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getInsert_date() {
        return insert_date;
    }

    public void setInsert_date(String insert_date) {
        this.insert_date = insert_date;
    }

//    public Integer getCity_id() {
//        return city_id;
//    }
//
//    public void setCity_id(Integer city_id) {
//        this.city_id = city_id;
//    }


}
