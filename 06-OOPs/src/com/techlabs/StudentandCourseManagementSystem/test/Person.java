package com.techlabs.StudentandCourseManagementSystem.test;

import com.techlabs.StudentandCourseManagementSystem.test.Departments;

public class Person {

	String name;
	Departments department;
	
	public Person(String name, Departments department) {
		this.name = name;
		this.department = department;
	}
	
	public void getDetails() {
		System.out.println("Name: "+name);
		System.out.println("Department: "+department);
	}
}
