package com.techlabs.SwitchCase.test;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number1: ");
		int number1 = scanner.nextInt();

		System.out.println("Enter the Number2: ");
		int number2 = scanner.nextInt();

		System.out.println("Enter Choice: (1-Addition, 2-Substraction, 3-Multiplication, 4-Division) ");
		int choice = scanner.nextInt();

		switch (choice) {

		case 1:
			int addition = number1 + number2;
			System.out.println("Addition of the number: " + addition);
			break;

		case 2:
			int subtraction = number1 - number2;
			System.out.println("Subtraction of the number: " + subtraction);
			break;

		case 3:
			int multiplication = number1 * number2;
			System.out.println("Multiplication of the number: " + multiplication);
			break;

		case 4:
			int division = number1 / number2;
			System.out.println("Division of the number: " + division);
			break;

		default:
			System.out.println("Put valid Number");
		}

	}
}
