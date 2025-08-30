package com.techlabs.StringExample.test;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter String1: ");
	String input1 = scanner.nextLine();
	
	System.out.println("Enter String2: ");
	String input2 = scanner.nextLine();
	
	
	StringBuilder stringBuilder = new StringBuilder(input2);
	
	stringBuilder.reverse();
	if(input1.equals(stringBuilder.toString())) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	
	
	scanner.close();
}
}
