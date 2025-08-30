package com.techlabs.constructortest.test;

public class MarksofStudents {

	String name;
	int rollNumber;
	int[] subjectmarks;

	public MarksofStudents(String name, int rollNumber, int[] subjectmarks) {
		this.name = name;
		this.rollNumber = rollNumber;

		this.subjectmarks = new int[subjectmarks.length];
		for (int i = 0; i < subjectmarks.length; i++) {
			this.subjectmarks[i] = subjectmarks[i];
		}
	}

	public void display() {
		System.out.println("Name of Student: " + name + ", Roll Number: " + rollNumber);
		for (int j = 0; j < subjectmarks.length; j++) {
			System.out.println("  Subject Marks " + (j + 1) + ": " + subjectmarks[j]);
		}
		System.out.println();

	}
}
