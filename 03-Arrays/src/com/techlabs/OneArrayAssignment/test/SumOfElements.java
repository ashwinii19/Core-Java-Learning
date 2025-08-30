package com.techlabs.OneArrayAssignment.test;

import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of an array: ");
		int size = scanner.nextInt();

		int[] numbers = new int[size];

		System.out.println("Enter the Number: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		System.out.println("Sum of the Elements: " + sum);
		
		scanner.close();
	}
}
