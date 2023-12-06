package com.example.StudentRegistrationFormUsingParam.REST;

import com.example.StudentRegistrationFormUsingParam.Entity.Student;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Name;

@Controller
public class StudentClassController {

    @GetMapping("/form")
    public String show(Model model){
        Student student=new Student();
        model.addAttribute("stud",student);
        return "StudForm";
    }

    @RequestMapping("/showdata")
    public String showdata(@ModelAttribute("stud") Student studentdata){
        return "Display";
    }


}
