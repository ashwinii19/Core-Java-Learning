package com.techlabs.abstractexample.model;

public abstract class Employee {

	String name;
	int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	abstract void calculateSalary();
}
