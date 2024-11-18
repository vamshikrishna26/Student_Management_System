package com.school.sriramschool.serviceIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.sriramschool.entity.Student;
import com.school.sriramschool.repository.StudentRepository;
import com.school.sriramschool.service.StudentService;


@Service
public class StudentServiceIMP implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository; 
	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get() ;
	}
	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	@Override
	public void deleteBtId(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
		
	}

}
