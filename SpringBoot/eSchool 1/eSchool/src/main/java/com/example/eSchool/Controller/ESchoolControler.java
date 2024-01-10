package com.example.eSchool.Controller;

import com.example.eSchool.Entity.Registration;
import com.example.eSchool.Entity.Teacher;
import com.example.eSchool.Service.RegistrationImplemented;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//@RestController("/")
public class ESchoolControler {
    private RegistrationImplemented registrationImplemented;
//    private TeacherImplemented teacherImplemented;

@Autowired
    public ESchoolControler(RegistrationImplemented registrationImplemented) {
        this.registrationImplemented = registrationImplemented;
    }

//    public ESchoolControler(TeacherImplemented teacherImplemented) {
//        this.teacherImplemented = teacherImplemented;
//    }

    @GetMapping("/register")
    public String form(Model model){
        Registration registration=new Registration();
        model.addAttribute("stud",registration);
        return "Registration";
    }
    @PostMapping ("/registertion")
    public String save(@ModelAttribute("stud") Registration theregistration) {
    registrationImplemented.save(theregistration);
        return "Index.html";
    }
@GetMapping("/Teacher")
    public String addStudent(Model model){
        Teacher teacher=new Teacher();
        model.addAttribute("teach",teacher);
        return "";
    }
//    @PostMapping("/teaches")
//    public String save(@ModelAttribute("teach") Teacher theteacher){
//    teacherImplemented.addStudent();
//    return "";
//    }


    




}
