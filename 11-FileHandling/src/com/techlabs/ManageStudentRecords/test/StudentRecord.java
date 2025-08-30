package com.techlabs.ManageStudentRecords.test;

import java.util.Scanner;

import com.techlabs.ManageStudentRecords.model.StudentManager;

public class StudentRecord {
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("\n=== Student Record System ===");
			System.out.println("1. Add Student");
			System.out.println("2. View Students");
			System.out.println("3. Search Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Exit");
			System.out.print("Enter your choice (1-5): ");

			String input = scanner.nextLine(); 

			try {
				choice = Integer.parseInt(input);

				if (choice >= 1 && choice <= 5) {
					if (choice == 1) {
						studentManager.addStudent();
					} else if (choice == 2) {
						studentManager.viewStudents();
					} else if (choice == 3) {
						studentManager.searchStudent();
					} else if (choice == 4) {
						studentManager.deleteStudent();
					} else if (choice == 5) {
						System.out.println("Program ended.");
					}
				} else {
					System.out.println("Invalid choice. Please enter a number between 1 and 5.");
				}

			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter digits only (1 to 5).");
			}

		} while (choice != 5);
	}
}