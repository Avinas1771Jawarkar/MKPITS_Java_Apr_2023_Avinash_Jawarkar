package com.example.ThursdayCurdWithBharat.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column
    private String user_name;

    @Column
    private String user_address;


    public void setUser_id(int id){
        this.user_id = id;
    }
    public int getUser_id(){
        return user_id;
    }

    public void setUser_name(String name){
        this.user_name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }
}
