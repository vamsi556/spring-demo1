package com.vm.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.vm.vo.Student;

@Service
public class StudentService {

	
	Map<String,Student> stMap= new HashMap<>();
	
	public Student addStudent(Student st) {
		 stMap.put(st.id, st);
		return st;
	}

	public List<Student> getAll() {
		return stMap.values().stream().toList();
	}

	
}
