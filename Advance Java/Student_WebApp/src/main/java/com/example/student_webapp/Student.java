package com.example.student_webapp;

import java.security.PrivateKey;

public class Student {
    private  String Rollno;
    private String Name;
    private String Address;
   private  String City;

    public Student() {
    }

    public Student(String rollno, String name, String address, String city) {
        Rollno = rollno;
        Name = name;
        Address = address;
        City = city;
    }

    public String getRollno() {
        return Rollno;
    }

    public void setRollno(String rollno) {
        Rollno = rollno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
