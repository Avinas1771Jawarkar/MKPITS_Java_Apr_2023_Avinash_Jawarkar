package com.example.eSchool.Service;

import com.example.eSchool.Entity.Student;
import com.example.eSchool.Repsostriy.Student1Repsostriy;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class StudentImplemented implements StudentServiceclass{
    private Student1Repsostriy student1Repsostriy;
@Autowired
    public StudentImplemented(Student1Repsostriy student1Repsostriy) {
        this.student1Repsostriy = student1Repsostriy;
    }

    @Override
    @Transactional
    public String addStudent(Student student) {
    student1Repsostriy.save(student);
        return "inserted data";
    }
}
