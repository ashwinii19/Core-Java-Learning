package com.techlabs.comparable.model;

public class Student implements Comparable<Student> {

	public String name;
	public int id;
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int compareTo(Student student) {
		return this.id - student.id;
//		return this.name.compareToIgnoreCase(student.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	

}
