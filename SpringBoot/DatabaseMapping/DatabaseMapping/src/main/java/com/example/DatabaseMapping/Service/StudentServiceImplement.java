package com.example.DatabaseMapping.Service;

import com.example.DatabaseMapping.Entity.Student;
import com.example.DatabaseMapping.Repsositry.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplement implements StudentService {
    private StudentRepository studentRepository;
@Autowired
    public StudentServiceImplement(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional
    public String save(Student student) {
        studentRepository.save(student);
        return "Data inserted";
    }

    @Override
    public Student find(Integer rollno) {
    return studentRepository.findById(rollno).get();

    }

    @Override
    public List<Student> findallStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteData(Integer rollno) {
      studentRepository.deleteById(rollno);
    }


}
