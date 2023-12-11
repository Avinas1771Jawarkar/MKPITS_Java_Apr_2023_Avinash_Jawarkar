package com.example.Curd_Operation.Controller;

import com.example.Curd_Operation.Entity.Student;
import com.example.Curd_Operation.Service.StudentService;
import com.example.Curd_Operation.Service.StudentServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    public StudentServiceImplement studentServiceImplement;

    public StudentController(StudentServiceImplement studentServiceImplement) {
        this.studentServiceImplement = studentServiceImplement;
    }
//@GetMapping("/homepage")
//    public String homePage(Model model){
//        model.addAttribute("student" ,studentServiceImplement.getAllStudent());
//        return "Display";
//    }



    @GetMapping("/start")
    public String Displaylist(Model model){
      List<Student> studentList=  studentServiceImplement.getAllStudent();
        model.addAttribute("student",studentList);
        return "Display";
    }
    @GetMapping("/show")
    public String show(Model model){
       Student student= new Student();
       model.addAttribute("student", student);
        return "StudentForm";
    }


    @PostMapping("/StudentRecord")
    public String saveStudent(@ModelAttribute("student") Student thestudent){
        studentServiceImplement.saveStudent(thestudent);
        return "redirect:/student/start";
    }
    @ExceptionHandler(value = Exception.class)
    public String ecceptionerror(){
        return "exceptionError";
    }

//@GetMapping("/showupdate")
//    public String showUpdate(@PathVariable(value= "id")int studentid ,Model model){
//        Student dent =new Student();
//        dent=studentServiceImplement.getStudentbyID(studentid);
//        model.addAttribute("student" ,dent);
//        return "Update_Form";
//
//    }

    }


