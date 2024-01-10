package com.example.eSchool.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class Result {
    @Id
    private int resultid;
    private String assignmenttype;
    private Date date;
    private String marks;
    private int studentid;
    private int teacherid;

    public Result() {
    }

    public Result(int resultid, String assignmenttype, Date date, String marks, int studentid, int teacherid) {
        this.resultid = resultid;
        this.assignmenttype = assignmenttype;
        this.date = date;
        this.marks = marks;
        this.studentid = studentid;
        this.teacherid = teacherid;
    }
}
