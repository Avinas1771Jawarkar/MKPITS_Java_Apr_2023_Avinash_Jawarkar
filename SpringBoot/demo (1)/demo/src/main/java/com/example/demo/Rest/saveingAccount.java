package com.example.demo.Rest;

import org.springframework.stereotype.Component;

@Component

public class saveingAccount implements Account{

    public String display() {
        return " This is saving Account";
    }

    public saveingAccount() {
        System.out.println("Saving Account lazy");
    }
}
