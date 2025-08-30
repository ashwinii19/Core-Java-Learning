package com.techlabs.enumeration.model;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class GradeEvaluation {

	public static void getGrade(Grade grade) {

		switch (grade) {

		case A:
			System.out.println("Excellent");
			break;
			
		case B:
			System.out.println("Good");
			break;
			
		case C:
			System.out.println("OK");
			break;
			
		case D:
			System.out.println("Poor");
			break;
			
		case F:
			System.out.println("Very Poor");
			break;
			
		default:
			System.out.println("Invalid grade");
			break;

		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Grade: ");
		String inputgrade = scanner.nextLine().toUpperCase();
		Grade grade = Grade.valueOf(inputgrade);
		getGrade(grade);


		scanner.close();
	}
}
