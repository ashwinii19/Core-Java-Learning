package com.techlabs.constructortest.test;

public class Students {

	String name;
	int rollNumber;
	float cgpa;

	public Students(String name, int rollNumber, float cgpa) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.cgpa = cgpa;
	}

	public void display() {
		System.out.println("Name " + name + " RollNumber " + rollNumber + " cgpa " + cgpa);
		System.out.println(" ");
	}

}
