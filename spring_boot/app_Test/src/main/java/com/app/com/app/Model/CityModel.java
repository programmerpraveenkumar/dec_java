package com.app.com.app.Model;


import javax.persistence.*;

@Entity
@Table(name="city")//value comes from the mysql table name
public class CityModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;
    String name;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
