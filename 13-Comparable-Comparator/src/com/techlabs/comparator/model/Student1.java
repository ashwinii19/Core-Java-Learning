package com.techlabs.comparator.model;

public class Student1  {

	String name;
	int id;
	
	public Student1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
}
