package com.demo.studentmanagement;

import com.demo.studentmanagement.entity.Student;
import com.demo.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}


@Autowired
private StudentRepository studentRepository;
@Override
public void run(String...args) throws Exception{
	/*Student student1= new Student("ramesh","pradhan","pradhansambit@2005gmailcom");
	studentRepository.save(student1);

	Student student2 = new Student("sanjay","rathore","sanjayrathore@gmail.com");
	studentRepository.save(student2);*/
}
}