package com.techlabs.StudentPerformanceManagementSystemproject.model;

public abstract class Student {

	String name;
	int rollNumber;
	String stream;
	
	public Student(String name, int rollNumber, String stream) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.stream = stream;
	}
	
	public abstract double calculatePerformance();
	
	public void displayInfo() {
		System.out.println("Name of the Student: "+name);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Stream: "+stream);
	}
	
	
}
