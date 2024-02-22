package com.example.ThursdayCurdWithBharat.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SavingAccount implements Account{
    @Override
    public String myAccount() {

        System.out.println("My Account");
        return "MyAccount with primary";
    }

    public SavingAccount() {

        System.out.println("saving account default primary");
    }
}
