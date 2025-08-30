package com.techlabs.reflection.model;

public class Student {

	String name;
	int rollNumber;
	double cgpa = 9.13;
	
	public Student() {
		
	}
	
	public Student(String name, int rollNumber, double cgpa) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.cgpa = cgpa;
	}
	
	public void greet() {
		System.out.println("My core java is completed today");
	}
	
	public double result(double cgpa) {
		return cgpa;
	}
	
}
