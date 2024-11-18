package com.school.sriramschool.service;

import java.util.List;

import com.school.sriramschool.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteBtId(Long id);

}
