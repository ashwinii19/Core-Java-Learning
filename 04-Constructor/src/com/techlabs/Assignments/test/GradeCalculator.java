package com.techlabs.Assignments.test;

import java.util.Scanner;

public class GradeCalculator {
public static void main(String[] args) {
	
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the Percentage of student: ");
	int percentage = scanner.nextInt();
	
	if(percentage >= 90) {
		System.out.println("Grade A");
	}
	else if(percentage >= 75) {
		System.out.println("Grade B");
	}
	else if(percentage >= 60) {
		System.out.println("Grade C");
	}
	else {
		System.out.println("Grade D");
	}

	
	
	
	scanner.close();
}
}
