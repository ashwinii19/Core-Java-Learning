package com.techlabs.Assignments.test;

import java.util.Scanner;

public class Countdigitlettersandspecialcharacter {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the String");
	String string = scanner.nextLine();
	
	int digit = 0;
	int letters = 0;
	int specialcharacter = 0;
	
	for(int i=0; i<string.length(); i++) {
		char character = string.charAt(i);
		if(character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z') {
			letters++;
		}
		else if(character >= '0' && character <= '9') {
			digit++;
		}
		else {
			specialcharacter++;
		}
	}
	
	System.out.println("Letters: "+letters);
	System.out.println("Digits: "+digit);
	System.out.println("Special Character: "+specialcharacter);

	scanner.close();
}
}
