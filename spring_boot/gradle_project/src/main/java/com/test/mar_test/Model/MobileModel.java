package com.test.mar_test.Model;


import javax.persistence.*;

@Entity
@Table(name="mobile_no")//value comes from the mysql table name
public class MobileModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;

    String mobile_no,network;
    Integer user_id;
    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



}
