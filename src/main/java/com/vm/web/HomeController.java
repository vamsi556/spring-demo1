package com.vm.web;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vm.service.StudentService;
import com.vm.vo.Student;

@RestController
public class HomeController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/home")
	public String home() {
		return "Home-"+LocalDate.now();
	}
	
	
	@PostMapping("/add/student")
	public Student addStudent(Student st) {
		return studentService.addStudent(st);
	}
	
	@GetMapping("/get/student")
	public List<Student> getStudent(Student st) {
		return studentService.getAll();
	}
}
