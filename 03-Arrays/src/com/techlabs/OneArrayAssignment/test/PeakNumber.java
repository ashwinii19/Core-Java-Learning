package com.techlabs.OneArrayAssignment.test;

import java.util.Scanner;

public class PeakNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of an array: ");
		int size = scanner.nextInt();

		int[] numbers = new int[size];

		System.out.println("Enter the numbers: ");
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}

		if (numbers[0] > numbers[1]) {
			System.out.println(numbers[0]);
		}
		if (numbers[size - 1] > numbers[size - 2]) {
			System.out.println(numbers[size - 1]);
		}
		for (int i = 1; i < size - 1; i++) {
			if (numbers[i - 1] < numbers[i] && numbers[i] > numbers[i + 1]) {
				System.out.println(numbers[i]);
			}

		}

		scanner.close();

	}
}
