package com.example.ThursdayCurdWithBharat.services;

import com.example.ThursdayCurdWithBharat.model.Employees;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    List<Employees> getAllEmployees();

    void saveEmployee(Employees employees);

    Employees getEmployeeById(long id);

    void deleteEmployeeById(long id);



}
