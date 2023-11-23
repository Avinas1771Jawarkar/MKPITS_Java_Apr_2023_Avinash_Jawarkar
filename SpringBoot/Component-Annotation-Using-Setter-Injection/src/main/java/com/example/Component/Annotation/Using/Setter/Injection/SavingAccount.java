package com.example.Component.Annotation.Using.Setter.Injection;

import org.springframework.stereotype.Component;
@Component
public class SavingAccount implements Account {

    public String display() {
            return "Saving Account";
        }
    }

