package com.example.eSchool.Service;

import com.example.eSchool.Repsostriy.TeacherRepsostriy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherServiceClassImplemented implements TeacherService {

    private TeacherRepsostriy teacherRepsostriy;
@Autowired
    public TeacherServiceClassImplemented(TeacherRepsostriy teacherRepsostriy) {
        this.teacherRepsostriy = teacherRepsostriy;
    }

    @Override
    @Transactional
    public String addStudent(TeacherService teacherService){
 teacherRepsostriy.save(teacherService);

        return "student Data inserted";
    }
}
