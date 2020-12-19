package com.srv.playground.beans;

public class Student {
	
	public Student() {
		
	}
	
	public Student(String name, String rollNo, String grade) {
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}
	
	private String name;
	private String rollNo;
	private String grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", grade=" + grade + "]";
	}
	
}
