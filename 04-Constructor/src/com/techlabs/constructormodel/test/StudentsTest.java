package com.techlabs.constructormodel.test;

import java.util.Scanner;

import com.techlabs.constructortest.test.Students;

public class StudentsTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number of Students: ");
		int numberofstudents = scanner.nextInt();
		scanner.nextLine();

		Students[] student = new Students[numberofstudents];

		for (int i = 0; i < numberofstudents; i++) {
			System.out.println("Details of Students" + (i + 1) + " ");
			System.out.println("Enter the Name of Student: ");
			String name = scanner.nextLine();

			System.out.println("Enter the RollNumber of Student: ");
			int rollNumber = scanner.nextInt();

			System.out.println("Enter the CGPA of the student");
			float cgpa = scanner.nextInt();
			scanner.nextLine();

			student[i] = new Students(name, rollNumber, cgpa);
		}

		for (Students result : student) {
			result.display();
		}

		scanner.close();
	}
}
