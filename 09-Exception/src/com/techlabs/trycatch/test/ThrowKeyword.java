package com.techlabs.trycatch.test;

import java.util.Scanner;

public class ThrowKeyword {

	public static void validateMarks(int marks) {
		if(marks < 0 || marks > 100) {
			throw new IllegalArgumentException("Enter Valid Marks");
		}
		System.out.println("Your Marks: "+marks);
	}

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Marks: ");
			int marks = scanner.nextInt();
			validateMarks(marks);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
