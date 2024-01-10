package com.example.eSchool.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Teacher {

    @Id
    private int teacherid;
private String name;
private String subject;
private String classassinged;
private String accountstatus;




    public Teacher() {
    }

    public Teacher(int teacherid, String name, String subject, String classassinged, String accountstatus) {
        this.teacherid = teacherid;
        this.name = name;
        this.subject = subject;
        this.classassinged = classassinged;
        this.accountstatus = accountstatus;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getClassassinged() {
        return classassinged;
    }

    public void setClassassinged(String classassinged) {
        this.classassinged = classassinged;
    }

    public String getAccountstatus() {
        return accountstatus;
    }

    public void setAccountstatus(String accountstatus) {
        this.accountstatus = accountstatus;
    }
}
