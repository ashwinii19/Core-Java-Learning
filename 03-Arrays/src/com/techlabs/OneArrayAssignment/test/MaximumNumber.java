package com.techlabs.OneArrayAssignment.test;

import java.util.Scanner;

public class MaximumNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of Array: ");
		int size = scanner.nextInt();

		int[] numbers = new int[size];

		System.out.println("Enter the Numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		int maximum = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > maximum) {
				maximum = numbers[i];
			}
		}
		System.out.println("Maximum Element of an Array: " + maximum);
		
		scanner.close();
	}
}
