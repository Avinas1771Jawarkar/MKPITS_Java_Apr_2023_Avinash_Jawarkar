package com.example.Curd_Operation.Entity;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    private int studentid;
    private String name;
    private String lastname;
    private String email;

    public Student() {
    }

    public Student(int studentId, String name, String lastname, String email) {
        this.studentid = studentId;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public int getStudentId() {
        return studentid;
    }

    public void setStudentId(int studentId) {
        this.studentid = studentId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}