package com.techlabs.StudentandCourseManagementSystem.test;

import java.util.zip.CheckedOutputStream;

public class Professor extends Person {

	int professorId;
	String assignedSubject;
	Coursetype courseType;

	public Professor(String name, int professorId, Departments department) {
		super(name, department);
		this.professorId = professorId;
	}
	
	public void assignSubject(Coursetype course) {
		this.courseType = course;
		if(Coursetype.CORE==course) {
			assignedSubject = "Java";
			System.out.println("Assigned CORE Subject: "+assignedSubject);
		}
		else if(Coursetype.ELECTIVE==course){
			assignedSubject = "UID";
			System.out.println("Assigned ELECTIVE Subject: "+assignedSubject);
		}
		else {
			assignedSubject = "Invalid";
			System.out.println("Invalid Choice");
		}
	}

	@Override
	public void getDetails() {
		System.out.println("Name of the Professor: "+name);
		System.out.println("Professor ID: "+professorId);
		System.out.println("Department: "+department);
		System.out.println("Assigned Subject: "+assignedSubject);
	}
}
