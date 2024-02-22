package com.example.ThursdayCurdWithBharat.services;

import com.example.ThursdayCurdWithBharat.model.Employees;
import com.example.ThursdayCurdWithBharat.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;
//    In your specific example, it's injecting an EmployeeRepository instance into your service,
//    which allows you to use the repository to interact with the database in your service methods.

    @Override
    public List<Employees> getAllEmployees() {

        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employees employees) {
        this.employeeRepository.save(employees);
//        In summary, JpaRepository extends CrudRepository and adds
//    JPA-specific features, making it more suitable for working with JPA entities in a Spring Data JPA application.
//        If you only need basic CRUD operations, you can use CrudRepository. However, if you want the additional
//        features and the ability to create custom queries easily, JpaRepository is a better choice.
    }

    @Override
    public Employees getEmployeeById(long id) {
        Optional<Employees> optional = employeeRepository.findById(id);
        Employees employees = null;
        if(optional.isPresent()){
            employees = optional.get();
        }
        else {
            throw new RuntimeException("Not a valid ID");
        }
        return employees;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);




    }


}
