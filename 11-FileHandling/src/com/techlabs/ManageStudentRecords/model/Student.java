package com.techlabs.ManageStudentRecords.model;

public class Student {

	int rollNumber;
	String name;
	int marks;
	
	public Student(int rollNumber, String name, int marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return rollNumber + "," + name + "," + marks;
	}	
}
