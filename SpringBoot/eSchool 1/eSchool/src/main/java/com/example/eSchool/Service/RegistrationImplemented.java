package com.example.eSchool.Service;

import com.example.eSchool.Entity.Registration;
import com.example.eSchool.Repsostriy.StudentRepsostriy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationImplemented implements StudentService{

    private StudentRepsostriy studentRepsostriy;
@Autowired
    public RegistrationImplemented(StudentRepsostriy studentRepsostriy) {
        this.studentRepsostriy = studentRepsostriy;
    }

    @Override

    public String save(Registration registration) {
        studentRepsostriy.save(registration);
        return"inserted" ;
    }
}
