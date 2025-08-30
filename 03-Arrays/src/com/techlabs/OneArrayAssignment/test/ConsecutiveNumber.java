package com.techlabs.OneArrayAssignment.test;

import java.util.Scanner;

public class ConsecutiveNumber {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the size of the Array: ");
	int size = scanner.nextInt();
	
	int[] numbers = new int[size];
	
	System.out.println("Enter the Numbers: ");
	for(int i=0; i<numbers.length; i++) {
		numbers[i] = scanner.nextInt();
	}
	
	
	int maximumcount = 0;
	int counter = 0;
	for(int i=0; i<numbers.length; i++) {
		if(numbers[i] == 1) {
			counter++;
		}
		else {
			counter = 0;
		}
		if (counter > maximumcount) {
			maximumcount=counter;
		}
	
	}
	System.out.println(maximumcount);
	
	scanner.close();
}
}
