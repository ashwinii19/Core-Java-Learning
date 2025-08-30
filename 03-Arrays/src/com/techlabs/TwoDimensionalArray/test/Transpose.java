package com.techlabs.TwoDimensionalArray.test;

import java.util.Scanner;

public class Transpose {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[][] matrix = new int[2][3];

		System.out.println("Enter the Numbers: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("\nTranspose of an Numbers: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println(" ");
		}

		scanner.close();
	}
}
