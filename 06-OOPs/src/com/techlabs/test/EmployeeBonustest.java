package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.EmployeeBonus;

public class EmployeeBonustest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Name of the Employee: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter the Salary of the Employee: ");
		double salary = scanner.nextDouble();
		
		System.out.println("Enter the bonus of the Employee: ");
		double bonus = scanner.nextFloat();
		
		
		
		EmployeeBonus employeebonus = new EmployeeBonus();
		if(bonus <= (0.20*salary)) {
			employeebonus.setbonus(bonus);
		}
		employeebonus.setsalary(salary);
		employeebonus.displaysalary();
		
		
		
		scanner.close();
	}
}
