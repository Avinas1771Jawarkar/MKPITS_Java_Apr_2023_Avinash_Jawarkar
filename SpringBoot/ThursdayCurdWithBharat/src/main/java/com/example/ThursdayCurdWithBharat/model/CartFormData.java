package com.example.ThursdayCurdWithBharat.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class CartFormData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String product;

    @Column(name = "quantity")
    private int quantity;
}
