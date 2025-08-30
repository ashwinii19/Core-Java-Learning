package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Student;

public class Student_test {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter The Name of Student");
	String name = scanner.nextLine();
	System.out.println("Enter the Roll Number");
	int rollNumber = scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter the Course ");
	String course = scanner.nextLine();
	Student student = new Student(name,rollNumber,course);
	student.display();
	
	
}
}
