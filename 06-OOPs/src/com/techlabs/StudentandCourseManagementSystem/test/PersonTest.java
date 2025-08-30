package com.techlabs.StudentandCourseManagementSystem.test;

import com.techlabs.StudentandCourseManagementSystem.test.Departments;

import com.techlabs.StudentandCourseManagementSystem.test.Student;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("Name of the Student: ");
		String name = scanner.nextLine();
		
		System.out.println("Roll Number: ");
		int rollNumber = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Department (IT, CS, AIDS): ");
		Departments department = Departments.valueOf(scanner.nextLine().toUpperCase());
		Student students = new Student(name, rollNumber, department);

		
		System.out.println("Course Type: \n1.CORE(Java)\n2.ELECTIVE(UID)");
		System.out.println("Enter course type(CORE or ELective): ");
		Coursetype courseType = Coursetype.valueOf(scanner.nextLine().toUpperCase());
		students.enrollcourses(courseType);
		
		System.out.println("\n--- Student Details ---");
		
		students.getDetails();
		
		
		
		
		
		
		
		
		
		System.out.println("---------------------------------");
		System.out.println("Name of the Professor: ");
		String professorname = scanner.nextLine();
		
		System.out.println("Professor ID: ");
		int professorId = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Department (IT, CS, AIDS): ");
		Departments professordepartment = Departments.valueOf(scanner.nextLine().toUpperCase());
		
		Professor professor = new Professor(professorname, professorId, professordepartment);

		
		System.out.println("Assign course type(CORE or ELective): ");
		Coursetype professorcourse = Coursetype.valueOf(scanner.nextLine().toUpperCase());
		
		professor.assignSubject(professorcourse);
		
		System.out.println("\n--- Professor Details ---");
		
		professor.getDetails();
		
		System.out.println("\n Total Students: "+Student.studentcount);
		
		scanner.close();
	}
}