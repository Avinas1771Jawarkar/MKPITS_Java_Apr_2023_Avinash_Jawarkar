package com.example.DatabaseMapping.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address;
    private String city;

    public Address() {
    }

    public Address( String address, String city) {

        this.address = address;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {

        return "Address{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
