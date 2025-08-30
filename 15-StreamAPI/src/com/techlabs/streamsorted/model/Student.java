package com.techlabs.streamsorted.model;

public class Student {

	String name;
	int rollNumber;
	double cgpa;
	
	public Student(String name, int rollNumber, double cgpa) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public double getCgpa() {
		return cgpa;
	}
	
	
}
