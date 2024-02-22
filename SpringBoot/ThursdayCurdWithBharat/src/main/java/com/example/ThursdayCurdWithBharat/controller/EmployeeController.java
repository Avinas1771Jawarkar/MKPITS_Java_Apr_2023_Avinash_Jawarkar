package com.example.ThursdayCurdWithBharat.controller;

import com.example.ThursdayCurdWithBharat.model.Employees;
import com.example.ThursdayCurdWithBharat.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String viewHomePage(Model model){

        model.addAttribute("listEmployess",employeeService.getAllEmployees());
        return "index";
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployee(Model model){
        Employees employees = new Employees();
        model.addAttribute("employee",employees);
        return "new_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee")Employees employees){
        //saving data
        employeeService.saveEmployee(employees);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable (value = "id")long id , Model model){

//        getting employee from serviced

        Employees employees = new Employees();

               employees =  employeeService.getEmployeeById(id);

        model.addAttribute("employee",employees);
        return "update_employee";
    }


    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable (value = "id") long id){

        this.employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }

    @GetMapping("/showLoginPage")
    public String redirectPage(){

        return "LoginPage";
    }
}
