package com.techlabs.serialization.model;

import java.io.Serializable;

public class Employee implements Serializable{

	String name;
	int id;
	double salary;
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public  void displayInfo() {
		System.out.println("Name of the Employee: "+name);
		System.out.println("Employee ID: "+id);
		System.out.println("Salary of Employee: "+salary);
	}
}
