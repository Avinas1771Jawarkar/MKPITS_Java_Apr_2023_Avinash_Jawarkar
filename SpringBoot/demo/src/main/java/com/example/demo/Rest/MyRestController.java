package com.example.demo.Rest;

import com.example.demo.Rest.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyRestController {

//    @Value("${stud.name}")
//    private String name;

    private Account account;

    @Autowired
    public MyRestController(Account account) {
        this.account =account;
    }

    @GetMapping("/dis")
    public String displayDetails(){

        return account.display();

    }
}
