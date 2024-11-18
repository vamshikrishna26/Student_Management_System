package com.spproject.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spproject.studentmanagement.entity.Student;
import com.spproject.studentmanagement.repository.StudentRepository;

@SpringBootApplication
public class StudentmanagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*Student student1=new Student("Vamshi krishna","Aeddula","vamshikrishna.aeddula@gmail.com");
		studentRepository.save(student1);
		
		Student student2=new Student("DurgaPrasad","Chintapalli","chintapalli.durgaprasad@gmail.com");
		studentRepository.save(student2);
		
		Student student3=new Student("Narendra","Alapuram","narendra.alampuram@gmail.com");
		studentRepository.save(student3); */


		
				
				
		
	}

}
