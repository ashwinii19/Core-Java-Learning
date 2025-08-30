package com.techlabs.TwoDimensionalArray.test;

import java.util.Scanner;

public class ThreebyThreeMatrix {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[][] matrix = new int[3][3];

		System.out.println("Enter the Numbers: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("The matrix is: ");
		for (int[] row : matrix) {
			for (int column : row) {
				System.out.print(column + " ");
			}
			System.out.println(" ");

		}

		scanner.close();
	}
}
