package com.example.StudentRegistrationFormUsingParam.REST;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Name;

@Controller
public class StudentClassController {

    @GetMapping("/form")
    public String form(){
        return "StudForm";
    }

    @RequestMapping("/showdata")
    public String showdata(HttpServletRequest httpServletRequest, Model model){

        String rollNo=httpServletRequest.getParameter("RollNo");
        String name= httpServletRequest.getParameter( "Name");
        String address=httpServletRequest.getParameter("Address");
        String city=httpServletRequest.getParameter("City");

        model.addAttribute("roll",rollNo);
        model.addAttribute("Nm",name);
        model.addAttribute("Add",address);
        model.addAttribute("cit",city);

        return "Display";
    }


}
