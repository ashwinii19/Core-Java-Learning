package com.techlabs.Assignments.test;

import java.util.Scanner;

public class TwoStringAnagram {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the String 1: ");
	String anagram1 = scanner.nextLine().toLowerCase();
	
	System.out.println("Enter the String 2: ");
	String anagram2 = scanner.nextLine().toLowerCase();
	
	int count =0;
	
	if(anagram1.length() == anagram2.length()) {
		for(int i=0; i<anagram1.length(); i++) {
			char character1 = anagram1.charAt(i);
			
			for(int j=0; j<anagram2.length(); j++) {
				char character2 = anagram2.charAt(j);
				
				if(character1 == character2) {
					count++;
					break;
				}
			}
		}
		
		if(count == anagram1.length()) {
			System.out.println("The Two Strings are Anagram");
		}
		else {
			System.out.println("The Two Strings are not Anagram");
		}
		
	}
	
	else {
		System.out.println("The Two Strings are not Anagram");
	}
	scanner.close();
}
}
