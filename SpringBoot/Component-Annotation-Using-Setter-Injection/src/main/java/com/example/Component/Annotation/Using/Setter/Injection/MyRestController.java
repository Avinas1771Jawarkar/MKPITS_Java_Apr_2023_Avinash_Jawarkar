package com.example.Component.Annotation.Using.Setter.Injection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyRestController {

//    @Value("${stud.name}")
//    private String name;

    private Account account;



    @Autowired
    public void setAccount(@Qualifier("savingAccount")Account account) {
        this.account = account;
    }



    @GetMapping("/display")
    public String displayDetails(){

        return account.display();

    }
}

