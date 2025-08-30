package com.techlabs.Assignments.test;

import java.util.Scanner;

public class VowelCounter {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	int vowelcount = 0;
	
	System.out.println("Enter a String");
	String vowel = scanner.nextLine();
	vowel = vowel.toLowerCase();
	
	for(int i=0; i<vowel.length(); i++) {
		char character = vowel.charAt(i);
		
		if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
			vowelcount++;
		}
	}
	
	System.out.println("Number of Vowels: "+vowelcount);
	
	scanner.close();
}
}
