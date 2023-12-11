package com.example.Curd_Operation.Service;

import com.example.Curd_Operation.Entity.Student;
//import com.example.Curd_Operation.StudentRepository.studentRepository;
import com.example.Curd_Operation.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplement implements StudentService{
    public StudentRepository studentRepository;

    @Autowired
    public StudentServiceImplement(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }

    @Override
    @Transactional
    public Student saveStudent(Student student) {
      return   studentRepository.save(student);
    }

//    @Override
//    public Student getStudentbyID(int studentid) {
//        Optional<Student> optionalStudent=studentRepository.findById(studentid);
//        Student student=null;
//      if(optionalStudent.isPresent()){
//        student=optionalStudent.get();
//         }
//      else {
//           throw new RuntimeException();
//        }
//       return student;
//    }
}

