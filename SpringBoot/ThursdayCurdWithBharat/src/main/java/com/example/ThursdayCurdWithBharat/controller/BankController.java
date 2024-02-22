package com.example.ThursdayCurdWithBharat.controller;

import com.example.ThursdayCurdWithBharat.services.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;

@RestController
public class BankController {


    private Account account;

//    @Autowired
//    public BankController(@Qualifier("currentAccount") Account account) {
//        this.account = account;
//
////        BY constructor
//    }

    @Autowired
    public BankController(@Qualifier("loanAmount") Account account) {
        this.account = account;

//        BY constructor
    }
//    @Autowired
//    public void setAccount(Account account){
//        this.account=account;
//
//    }

    @GetMapping("/myaccount")
    public String myMethod() {
        System.out.println(account);
        return account.myAccount();
    }
}
