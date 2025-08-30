package com.techlabs.model;

public class Employee {
	String name;
	int id;
	float basicsalary;

	public Employee(String name, int id, float basicsalary) {
		this.name = name;
		this.id = id;
		this.basicsalary = basicsalary;
	}

	public void generateSlip() {
		double HRA = (0.20 * basicsalary);
		double DA = (0.10 * basicsalary);
		double total_salary = basicsalary + HRA + DA;
		System.out.println("Total Salary of Employee :" + total_salary);

	}
}
