package com.techlabs.StudentandCourseManagementSystem.test;

public class Student extends Person {

	static int studentcount;
	int rollNumber;
	Coursetype course;
	
	public Student(String name, int rollNumber, Departments department) {   
		super(name, department);
		this.rollNumber = rollNumber;
		studentcount++;
	}
	
	public void enrollcourses(Coursetype course) {
		this.course = course;
		if(Coursetype.CORE==course) {
			System.out.println("Java");
		}
		else if(Coursetype.ELECTIVE==course){
			System.out.println("UID");
		}
		else {
			System.out.println("Invalid Choice");
		}
	}
	
	@Override
	public void getDetails() {
		System.out.println("Name of the Student: "+name);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Department: "+department);
		System.out.println("Course Type: "+course);
		System.out.println();
	}
}
