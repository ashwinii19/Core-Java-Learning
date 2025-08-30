package com.techlabs.StudentPerformanceManagementSystemproject.test;

import java.util.Scanner;

import com.techlabs.StudentPerformanceManagementSystemproject.model.ArtsStudent;
import com.techlabs.StudentPerformanceManagementSystemproject.model.CommerceStudent;
import com.techlabs.StudentPerformanceManagementSystemproject.model.ScienceStudent;
import com.techlabs.StudentPerformanceManagementSystemproject.model.Student;

public class StudentPerformanceManagementSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Student Performance Management System  ");
		Student[] student = new Student[2];

		System.out.println("Enter the Stream: \n1.Science Student\n2.Commerce Student\n3.Arts Student ");
		int choice = scanner.nextInt();
		while (choice < 1 || choice > 3) {
			System.out.println("Wrong Input. Enter again: ");
			choice = scanner.nextInt();
		}

		scanner.nextLine();

		if (choice == 1) {
			for (int i = 0; i < 2; i++) {

				System.out.println("Hello Science Student");
				System.out.println("Enter the name of the Student: " + (i + 1));
				String name = scanner.nextLine();

				System.out.println("Roll Number: ");
				int rollNumber = scanner.nextInt();

				System.out.println("Enter the marks of Physics: ");
				int physics = scanner.nextInt();

				System.out.println("Enter the marks of Chemistry: ");
				int chemistry = scanner.nextInt();

				System.out.println("Enter the marks of Math: ");
				int math = scanner.nextInt();
				scanner.nextLine();
				student[i] = new ScienceStudent(name, rollNumber, "Science", physics, chemistry, math);
			}
		} else if (choice == 2) {
			for (int i = 0; i < 2; i++) {
				System.out.println("-------------------------------");
				System.out.println("Hello Commerce Student");
				System.out.println("Enter the name of the Student: " + (i + 1));
				String name = scanner.nextLine();

				System.out.println("Roll Number: ");
				int rollNumber = scanner.nextInt();

				System.out.println("Enter the marks of Accounts: ");
				int accounts = scanner.nextInt();

				System.out.println("Enter the marks of Business Studies: ");
				int businessStudies = scanner.nextInt();

				System.out.println("Enter the marks of Economics: ");
				int economics = scanner.nextInt();
				scanner.nextLine();
				student[i] = new CommerceStudent(name, rollNumber, "Science", accounts, businessStudies, economics);
			}
		} else if (choice == 3) {
			for (int i = 0; i < 2; i++) {
				System.out.println("-------------------------------");
				System.out.println("Hello Arts Student");
				System.out.println("Enter the name of the Student: " + (i + 1));
				String name = scanner.nextLine();

				System.out.println("Roll Number: ");
				int rollNumber = scanner.nextInt();

				System.out.println("Enter the marks of History: ");
				int history = scanner.nextInt();

				System.out.println("Enter the marks of Political Science: ");
				int politicalScience = scanner.nextInt();

				System.out.println("Enter the marks of Sociology: ");
				int sociology = scanner.nextInt();
				scanner.nextLine();
				student[i] = new ArtsStudent(name, rollNumber, "Science", history, politicalScience, sociology);
			}
		}
		for (Student stu : student) {
			stu.displayInfo();
		}

	}
}
