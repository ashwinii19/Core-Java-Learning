package com.techlabs.OneArrayAssignment.test;

import java.util.Scanner;

public class RepeatingNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of Array: ");
		int size = scanner.nextInt();

		int[] numbers = new int[size];

		System.out.println("Enter the Numbers: ");
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}

		
		for (int i = 0; i < size; i++) {
			if (numbers[i] == -1) {
				continue;
			}
			int counter = 1;
			for (int j = i + 1; j < size; j++) {
				if (numbers[i] == numbers[j]) {
					counter++;
					numbers[j] = -1;
				}
			}
			System.out.println("Number: " + numbers[i] + " Appears: " + counter+ " Times");
		}

		scanner.close();
	}
}
