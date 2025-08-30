package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Employee;

public class Employee_test {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Employee Name :");
		String name = scanner.nextLine();
		
		System.out.println("Enter the Employee ID");
		int id = scanner.nextInt();
		
		System.out.println("Enter Basic Salary");
		float basicsalary = scanner.nextFloat();
		
		Employee employee = new Employee(name, id, basicsalary);
		
		employee.generateSlip();
	}

}
