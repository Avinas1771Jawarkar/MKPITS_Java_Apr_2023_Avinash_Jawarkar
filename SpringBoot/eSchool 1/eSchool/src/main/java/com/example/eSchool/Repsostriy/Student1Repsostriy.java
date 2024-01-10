package com.example.eSchool.Repsostriy;

import com.example.eSchool.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

public interface Student1Repsostriy extends JpaRepository<Student, Integer> {
}
