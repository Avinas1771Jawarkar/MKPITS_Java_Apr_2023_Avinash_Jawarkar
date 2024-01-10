package com.example.eSchool.Repsostriy;

import com.example.eSchool.Entity.Registration;
import com.example.eSchool.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepsostriy extends JpaRepository<Registration,Integer> {
}
