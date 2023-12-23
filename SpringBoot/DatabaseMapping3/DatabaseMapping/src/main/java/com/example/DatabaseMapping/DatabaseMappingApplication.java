package com.example.DatabaseMapping;

import com.example.DatabaseMapping.Entity.Address;
import com.example.DatabaseMapping.Entity.Course;
import com.example.DatabaseMapping.Entity.Student;
import com.example.DatabaseMapping.Service.StudentServiceImplement;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
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
//=\
		saveDate();
		findData(38);
//		allStudentFind();
//		deleteData();
	}

	public String  saveDate() {

		Address address = new Address("Shegaon naka", "Amravati");

		List<Course> courseslist = new ArrayList<>();
		Course course1 = new Course("Java");
		Course course2 = new Course("python");
		Student student = new Student("Pradnya", address,courseslist);
		courseslist.add(course1);
		courseslist.add(course2);
		student.setCourse(courseslist);
//		System.out.println(course1);
//		System.out.println(course2);
		String str= studentServiceImplement.save(student);
		System.out.println(student);
		System.out.println(courseslist);


		return str;



	}

	public void findData(Integer rollno){
   Student student= studentServiceImplement.find(rollno);
		System.out.println(student);
	}

	public void allStudentFind(){
		List<Student> studentList= studentServiceImplement.findallStudent();
		System.out.println(studentList);
	}

	public void deleteData(){
		studentServiceImplement.deleteData(29);


	}





}
