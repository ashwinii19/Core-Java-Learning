package com.techlabs.TwoDimensionalArray.test;

import java.util.Scanner;

public class SumofRowColumn {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[][] matrix = new int[3][3];

		System.out.println("Enter the Numbers: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("\nThe matrix is: ");
		for (int[] row : matrix) {
			for (int column : row) {
				System.out.print(column + " ");
			}
			System.out.println(" ");
		}
		int sum = 0;
		System.out.print("\nSum of the rows1: ");
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				sum = sum + matrix[i][j];
			}
			System.out.println(sum);
		}

		sum = 0;
		System.out.print("Sum of the rows2: ");
		for (int i = 1; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				sum = sum + matrix[i][j];
			}
			System.out.println(sum);
		}

		sum = 0;
		System.out.print("Sum of the rows3: ");
		for (int i = 2; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum = sum + matrix[i][j];
			}
			System.out.println(sum);
		}

		sum = 0;
		System.out.print("Sum of the column1: ");
		for (int j = 0; j < 1; j++) {
			for (int i = 0; i < 3; i++) {
				sum = sum + matrix[i][j];
			}
			System.out.println(sum);
		}

		sum = 0;
		System.out.print("Sum of the column2: ");
		for (int j = 1; j < 2; j++) {
			for (int i = 0; i < 3; i++) {
				sum = sum + matrix[i][j];
			}
			System.out.println(sum);
		}

		sum = 0;
		System.out.print("Sum of the column3: ");
		for (int j = 2; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				sum = sum + matrix[i][j];
			}
			System.out.println(sum);
		}

		scanner.close();
	}
}
