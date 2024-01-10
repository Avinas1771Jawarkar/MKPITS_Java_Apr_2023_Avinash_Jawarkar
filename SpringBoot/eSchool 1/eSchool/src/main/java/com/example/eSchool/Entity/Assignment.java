package com.example.eSchool.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.util.Date;
@Entity
@Table
public class Assignment {
    @Id
    private int assignmentid;
    private String title;
    private String subject;
    private Date date;
    private int classid;
    private  int teacherid;

    public Assignment() {
    }

    public Assignment(int assignmentid, String title, String subject, Date date, int classid, int teacherid) {
        this.assignmentid = assignmentid;
        this.title = title;
        this.subject = subject;
        this.date = date;
        this.classid = classid;
        this.teacherid = teacherid;
    }

    public int getAssignmentid() {
        return assignmentid;
    }

    public void setAssignmentid(int assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }
}
