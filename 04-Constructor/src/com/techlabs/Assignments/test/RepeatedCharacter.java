package com.techlabs.Assignments.test;

import java.util.Scanner;

public class RepeatedCharacter {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the String ");
	String repeatedcharacter = scanner.nextLine().toLowerCase();
	
	
	for(int i=0; i<repeatedcharacter.length(); i++) {
		char character = repeatedcharacter.charAt(i);
		for(int j=i+1; j<repeatedcharacter.length(); j++) {
			if(repeatedcharacter.charAt(i) == repeatedcharacter.charAt(j)) {
				System.out.println(repeatedcharacter.charAt(j));
				repeatedcharacter.replace(repeatedcharacter.charAt(j), '#');
			}
		}
	}
	
	
	
	
	scanner.close();
}
}
