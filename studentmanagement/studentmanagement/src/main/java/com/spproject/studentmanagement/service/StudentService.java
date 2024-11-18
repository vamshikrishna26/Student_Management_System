package com.spproject.studentmanagement.service;

import java.util.List;

import com.spproject.studentmanagement.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student updateStudent(Student student);
	Student getStudentById(Long id);
	void deleteById(Long id);

}
