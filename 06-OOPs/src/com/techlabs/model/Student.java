package com.techlabs.model;

public class Student {

	
	String name;
	int rollNumber;
	String course;
	
	public Student(String name,int rollNumber,String course) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.course=course;
	}
	public void display() {
		System.out.println("Student Name :"+ name +" Roll No:"+rollNumber+" Course Name:"+course);
	}
	
	
}
