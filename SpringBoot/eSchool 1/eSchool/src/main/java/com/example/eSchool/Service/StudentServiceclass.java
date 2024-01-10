package com.example.eSchool.Service;

import com.example.eSchool.Entity.Student;
import jakarta.transaction.Transactional;

public interface StudentServiceclass {
    public String addStudent();

    @Transactional
    String addStudent(Student student);
}
