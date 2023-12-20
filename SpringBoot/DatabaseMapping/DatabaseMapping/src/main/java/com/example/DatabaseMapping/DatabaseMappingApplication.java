package com.example.DatabaseMapping;

import com.example.DatabaseMapping.Entity.Address;
import com.example.DatabaseMapping.Entity.Student;
import com.example.DatabaseMapping.Service.StudentServiceImplement;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DatabaseMappingApplication implements CommandLineRunner {


private StudentServiceImplement studentServiceImplement;

	public DatabaseMappingApplication(StudentServiceImplement studentServiceImplement) {
		this.studentServiceImplement = studentServiceImplement;
	}

	public static void main(String[] args) {

		SpringApplication.run(DatabaseMappingApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
		saveDate();
		findData();
		allStudentFind();
		deleteData();
	}

	public void  saveDate(){

		Address address=new Address("Shegaon naka","Amravati");
		Student student=new Student("Kshitij",address);
		String record=studentServiceImplement.save(student);
		System.out.println(record);
	}

	public void findData(){
   Student student= studentServiceImplement.find(2);
		System.out.println(student);
	}

	public void allStudentFind(){
		List<Student> studentList= studentServiceImplement.findallStudent();
		System.out.println(studentList);
	}

	public void deleteData(){
		studentServiceImplement.deleteData(2);


	}




}
