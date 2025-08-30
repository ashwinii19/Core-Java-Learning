package com.techlabs.test;

import java.util.Scanner;

public class MethodWithoutParameter {

	public static int simpleineterest() {
		return 0;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter principle: ");
		int principle = scanner.nextInt();
		System.out.println("Enter rate: ");
		int rate = scanner.nextInt();
		System.out.println("Enter years: ");
		int years = scanner.nextInt();

		System.out.println("Simple Interest: " + ((principle*rate*years)/100));
		scanner.close();

	}
}
