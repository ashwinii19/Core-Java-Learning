package com.techlabs.OneArrayAssignment.test;

import java.util.Scanner;

public class ReadingDisplayingArray {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();

		int[] numbers = new int[size];

		System.out.println("Enter Array Numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		for (int result : numbers) {
			System.out.println("Entered Array Numbers: " + result);
		}
		
		scanner.close();
	}
}
