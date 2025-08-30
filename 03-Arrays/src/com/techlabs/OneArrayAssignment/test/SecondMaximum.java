package com.techlabs.OneArrayAssignment.test;

import java.util.Scanner;

public class SecondMaximum {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the size of an array: ");
	int size = scanner.nextInt();
	
	int[] numbers = new int[size];
	
	System.out.println("Enter the numbers: ");
	for(int i=0; i<numbers.length; i++) {
		numbers[i] = scanner.nextInt();
	}
	int maximum = numbers[0];
	int secondmaximum = Integer.MIN_VALUE;
	for(int i=1; i<numbers.length; i++) {
		if(numbers[i] > maximum) {
			secondmaximum = maximum;
			maximum = numbers[i];
		}
		else if(numbers[i] > secondmaximum && numbers[i] != maximum) {
			secondmaximum = numbers[i];
		}
	}
	System.out.println("Second Maximum: "+secondmaximum);
	scanner.close();
}
}
