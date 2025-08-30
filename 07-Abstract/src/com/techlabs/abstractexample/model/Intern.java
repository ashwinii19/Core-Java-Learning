package com.techlabs.abstractexample.model;

public  class Intern extends Employee{

	double stipend = 6000;
	double salary;
	double bonus;
	
	public Intern(String name, int id, double bonus, double salary){
		super(name, id);
		this.bonus = bonus;
		this.salary = salary;
	}
	
	@Override
	public void calculateSalary() {
		double totalSalary = salary + bonus;
		System.out.println("Salary of Intern: "+totalSalary);
	}
}
