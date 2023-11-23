package com.example.Component.Annotation.Using.Setter.Injection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy
@Component
public class CurrentAccount {
    public String display(){
        return "Current Account";
    }

}
