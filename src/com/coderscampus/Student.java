package com.coderscampus;

//Represents a student with ID, name, course and grade.

public class Student {
	
	private Integer id;
	private String name;
	private String course;
	private Integer grade;
	
	public Student(int int1, String string, String string2, int int2) {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}

}
