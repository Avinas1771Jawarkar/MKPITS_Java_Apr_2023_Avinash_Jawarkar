package com.example.eSchool.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Table

public class Attendance {
    private Timestamp date;
    private String AttendanceStatus;
    private int studentid;

    private int teacherid;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn( name="attendance_assignment")
//    private Assignment assignment;

    public Attendance() {
    }

    public Attendance(Timestamp date, String attendanceStatus, int studentid, int teacherid) {
        this.date = date;
        AttendanceStatus = attendanceStatus;
        this.studentid = studentid;
        this.teacherid = teacherid;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getAttendanceStatus() {
        return AttendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        AttendanceStatus = attendanceStatus;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }
}
