package com.srv.playground.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srv.playground.beans.Student;

@RestController
public class PlayGroundController {
	
	@RequestMapping("/students")
	public List<Student> getStudents() {
		
		return setStudentsData();
		
	}
	
	private List<Student> setStudentsData() {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Vignesh", "100", "6"));
		students.add(new Student("Karthi", "101", "7"));
		students.add(new Student("Martin", "102", "4"));
		students.add(new Student("Krishna", "103", "8"));
		students.add(new Student("Aj", "104", "9"));
		
		return students;
		
	}

}
