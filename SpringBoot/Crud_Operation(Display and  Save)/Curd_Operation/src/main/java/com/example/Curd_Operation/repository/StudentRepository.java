package com.example.Curd_Operation.repository;

import com.example.Curd_Operation.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
