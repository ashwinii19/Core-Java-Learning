package com.techlabs.abstractexample.test;

import java.util.Scanner;

import com.techlabs.abstractexample.model.Developer;
import com.techlabs.abstractexample.model.Intern;

public class EmployeeSalaryCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1.Developer");
		System.out.println("2.Intern");
		int choice = scanner.nextInt();
		scanner.nextLine();

		Developer[] developer = new Developer[2];
		if (choice == 1) {
			for (int i = 0; i < developer.length; i++) {
				System.out.println("-----------------------------------");
				System.out.println("Enter details of Developer: " + (i + 1));
				System.out.println("Enter the name of Developer: ");
				String name = scanner.nextLine();

				System.out.println("Enter the ID of Developer: ");
				int id = scanner.nextInt();

				System.out.println("Enter "+(i+1)+" of Developer bonus: ");
				double bonus = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.println("Enter "+(i+1)+" of Developer salary: ");
				double salary = scanner.nextDouble();
				scanner.nextLine();

				developer[i] = new Developer(name, id, bonus, salary);

			}

			for (Developer dev : developer) {
				dev.calculateSalary();
			}

		}

		
		
		
		
		Intern[] intern = new Intern[2];
		if (choice == 2) {
			for (int i = 0; i < intern.length; i++) {
				System.out.println("-----------------------------------");
				System.out.println("Enter details of Intern: " + (i + 1));
				System.out.println("Enter the name of Intern: ");
				String name = scanner.nextLine();
				
				System.out.println("Enter the ID of Intern: ");
				int id = scanner.nextInt();

				System.out.println("Enter "+(i+1)+" of Intern bonus: ");
				double bonus = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.println("Enter "+(i+1)+" of Intern salary: ");
				double salary = scanner.nextDouble();
				scanner.nextLine();

				intern[i] = new Intern(name, id, bonus, salary);

			}

			for (Intern inter : intern) {
				inter.calculateSalary();
			}

		}

		
		
	}
}
