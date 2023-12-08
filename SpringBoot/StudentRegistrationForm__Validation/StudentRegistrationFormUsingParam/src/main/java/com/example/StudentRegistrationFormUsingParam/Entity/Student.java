package com.example.StudentRegistrationFormUsingParam.Entity;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {
    @Min(value = 4 , message = "Value should be greater then then equal to 4")
    @Max(value = 6 , message = "Value should be less then then equal to 6")
private int rollNo;
private String name;
@NotNull(message = "is required")
@Size(min= 1,message ="is nedded")

private String address="";
private String city;
private String gender;

private String eduction;

    public Student() {
    }

    public Student(int rollNo, String name, String address, String city ,String gender ,String eduction) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.city = city;
        this.gender=gender;
        this.eduction=eduction;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEduction() {
        return eduction;
    }

    public void setEduction(String eduction) {
        this.eduction = eduction;
    }

}
