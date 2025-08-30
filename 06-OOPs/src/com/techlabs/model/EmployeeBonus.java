package com.techlabs.model;

public class EmployeeBonus {

	private String name;
	private double salary;
	private double bonus;
	
	public String getname() {
		return name;
	}
	
	public double getsalary() {
		return salary;
	}
	
	public double getbonus() {
		return bonus;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setsalary(double salary) {
		this.salary = salary;
	}
	
	public void setbonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void displaysalary() {
		System.out.println("Salary: "+salary);
		bonus = (salary*bonus)/100;
		System.out.println("\nFinal Salary: "+ (salary+bonus));
	}
}
