package com.example.DatabaseMapping.Service;

import com.example.DatabaseMapping.Entity.Course;
import com.example.DatabaseMapping.Entity.Student;

import java.util.List;

public interface StudentService {
    String save(Student student);

    Student find (Integer rollno);
    List<Student> findallStudent();

    void deleteData( Integer rollno);
//    String coursesave(Course course);




}
