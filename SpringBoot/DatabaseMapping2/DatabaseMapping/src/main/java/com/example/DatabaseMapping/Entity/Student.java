package com.example.DatabaseMapping.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_Information")
public class Student {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int rollno;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Student_Address_id" )
    private Address address;

    public Student() {
    }

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return rollno;
    }

    public void setId(int id) {
        this.rollno = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
