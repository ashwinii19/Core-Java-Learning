package com.techlabs.abstractexample.model;

public  class Developer extends Employee {

	double salary;
	double bonus;
	
	public Developer(String name, int id, double bonus, double salary){
		super(name, id);
		this.bonus = bonus;
		this.salary = salary;
	}
	
	@Override
	public void calculateSalary() {
		double totalSalary = salary + bonus;
		System.out.println("Salary of Developer: "+totalSalary);
	}

	
}
