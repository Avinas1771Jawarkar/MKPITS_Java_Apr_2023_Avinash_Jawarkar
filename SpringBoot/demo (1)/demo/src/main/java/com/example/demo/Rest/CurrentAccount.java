package com.example.demo.Rest;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component

public class CurrentAccount implements Account{

    @Override
    public String display() {
        return "This is Current Account";
    }

    public CurrentAccount() {
        System.out.println("Current Account lazy");
    }
}
