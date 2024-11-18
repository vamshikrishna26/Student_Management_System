package com.school.sriramschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.school.sriramschool.entity.Student;
import com.school.sriramschool.serviceIMP.StudentServiceIMP;


@Controller
public class StudentController {
	
	@Autowired
	private StudentServiceIMP studentServiceIMP;
	
	@GetMapping("/students")
	public String getStudents(Model model) {
		model.addAttribute("students", studentServiceIMP.getAllStudent());
		return "student";	
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student=new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String createStudent(@ModelAttribute("student")Student student) {
		studentServiceIMP.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable("id") long id,Model model) {
		model.addAttribute("student",studentServiceIMP.getStudentById(id));
		return "edit_student";
		
	}
	
	@PostMapping("/students/{id}")
	
	public String updateStudent(@PathVariable("id") Long id,@ModelAttribute("student")Student student,Model model) {
		Student existingStudent=studentServiceIMP.getStudentById(id);
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());
		studentServiceIMP.updateStudent(existingStudent);
		return "redirect:/students";
		
		
	}
	
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentServiceIMP.deleteBtId(id);
		return "redirect:/students";
	}
	
	   

}
