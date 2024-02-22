package com.example.ThursdayCurdWithBharat.configue;

import com.example.ThursdayCurdWithBharat.services.Account;
import com.example.ThursdayCurdWithBharat.services.LoanAmount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfigue  {
//    external class

    @Bean
   public Account loanAmount(){
       return new LoanAmount();
   }


}
