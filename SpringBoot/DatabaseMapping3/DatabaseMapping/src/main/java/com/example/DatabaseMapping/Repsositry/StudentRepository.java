package com.example.DatabaseMapping.Repsositry;

import com.example.DatabaseMapping.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
