package com.techlabs.Assignments.test;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int patternnumber = scanner.nextInt();
		
		for(int i=1; i<=patternnumber; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
