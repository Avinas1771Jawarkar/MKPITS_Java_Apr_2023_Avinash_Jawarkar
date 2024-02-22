package com.example.ThursdayCurdWithBharat.repo;

import com.example.ThursdayCurdWithBharat.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employees, Long>{
}
