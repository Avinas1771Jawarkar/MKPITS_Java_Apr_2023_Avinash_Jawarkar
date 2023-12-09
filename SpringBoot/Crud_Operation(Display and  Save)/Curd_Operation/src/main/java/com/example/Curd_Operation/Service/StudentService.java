package com.example.Curd_Operation.Service;

import com.example.Curd_Operation.Entity.Student;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

public interface StudentService {
  List<Student> getAllStudent();

  Student saveStudent(Student student);

//  Student getStudentbyID(int studentid);




}
