package com.techlabs.StringExample.test;

import java.util.Scanner;

public class RemoveSpaces {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a string");
	String input = scanner.nextLine();
	
	StringBuilder stringBuilder = new StringBuilder(input);
	
	for(int i=0; i<stringBuilder.length(); i++) {
		if(stringBuilder.charAt(i) == ' ') {
			stringBuilder.deleteCharAt(i);
		}
	}
	System.out.println(stringBuilder);
	
	scanner.close();
}
}
