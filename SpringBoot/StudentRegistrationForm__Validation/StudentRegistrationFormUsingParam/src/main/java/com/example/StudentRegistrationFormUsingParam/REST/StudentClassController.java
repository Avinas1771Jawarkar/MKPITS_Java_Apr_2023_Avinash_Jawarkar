package com.example.StudentRegistrationFormUsingParam.REST;

import com.example.StudentRegistrationFormUsingParam.Entity.Student;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Name;

@Controller
public class StudentClassController {

    @GetMapping ("/formdisplay")
    public String show(Model model){
        Student student=new Student();
        model.addAttribute("stud",student);
       return "StudForm";
    }

   @GetMapping("/s")
    public String showdata(
            @Valid @ModelAttribute("stud") Student studentdata , BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "StudForm";
        }
        else {

            return "Display";
        }

    }


}
