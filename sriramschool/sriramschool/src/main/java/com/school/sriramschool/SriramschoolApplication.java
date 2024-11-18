package com.school.sriramschool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.school.sriramschool.entity.Student;
import com.school.sriramschool.repository.StudentRepository;

@SpringBootApplication
public class SriramschoolApplication implements CommandLineRunner{

	public static void main(String[] args) {
			
		SpringApplication.run(SriramschoolApplication.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub	
		//Student s1=new Student("vamshikrishna","aeddula","vamshikrishna.aeddula@gmail.com");
		//studentRepository.save(s1);
		
		/*Student s2=new Student("Durga Prasad","Chintapalli","Chintapalli.durgaprasad@gmail.com");
		studentRepository.save(s2);
		
		Student s3=new Student("Narendra","alapuram","alapuram.narendra@gmail.com");
		studentRepository.save(s3);
		
		Student s4=new Student("Rahul","pasham","pasham.rahul@gmail.com");
		studentRepository.save(s4);*/
		
	}

}
