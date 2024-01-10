package com.example.eSchool.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Student {
    @Id
    private int studentid;
    private String name;
    private String studentclass;
    private int rollno;
    private String phone;

    public Student() {
    }

    public Student(int studentid, String name, String studentclass, int rollno, String phone) {
        this.studentid = studentid;
        this.name = name;
        this.studentclass = studentclass;
        this.rollno = rollno;
        this.phone = phone;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
