package com.techlabs.InputFromUser.test;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		
		char name1 = scanner.nextLine().charAt(0);
		
		
		System.out.println("Your Name is  " + name + "Your Age is "+ age);
		System.out.println("First Letter of the name: " + name1);
	}
}
