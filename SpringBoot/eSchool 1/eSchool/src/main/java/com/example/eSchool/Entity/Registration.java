package com.example.eSchool.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Registration {
    @Id
    private String  userid;
    private String password;
    private String name;
    private String lastname;
    private  String usertype;
    private String address;
    private String city;
    private String phone;

    public Registration() {
    }

    public Registration(String userid, String password, String name, String lastname, String usertype, String address, String city, String phone) {
        this.userid = userid;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.usertype = usertype;
        this.address = address;
        this.city = city;
        this.phone = phone;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
