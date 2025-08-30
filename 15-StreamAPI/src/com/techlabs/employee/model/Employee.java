package com.techlabs.employee.model;

import java.util.Date;

public class Employee {
	String name;
	public double salary;
	Date joiningDate;
	String gender;

	public Employee(String name, double salary, Date joiningDate, String gender) {
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.gender = gender;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return name + " | Salary: " + salary + " | Joined: " + joiningDate + " | Gender: " + gender;
	}
}