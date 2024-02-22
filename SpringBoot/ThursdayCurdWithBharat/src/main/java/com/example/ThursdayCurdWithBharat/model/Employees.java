package com.example.ThursdayCurdWithBharat.model;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    public void setId(long id){
        this.Id = id;
    }
    public Long getId(){
        return Id;
    }

    public void setFirstName(String first_name){
        this.firstName = first_name;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
