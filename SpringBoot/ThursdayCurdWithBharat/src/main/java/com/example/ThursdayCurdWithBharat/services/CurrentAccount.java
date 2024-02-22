package com.example.ThursdayCurdWithBharat.services;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements Account{
    public CurrentAccount() {

        System.out.println("Current Account Constructor");

    }

    @Override
    public String myAccount() {
        return "currentAccount ";
    }
}
