package com.techlabs.Assignments.test;

import java.util.Scanner;

public class StringPalindrome {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a String ");
	String palindrome = scanner.nextLine();
	palindrome = palindrome.toLowerCase();
	
	for(int i=0; i<palindrome.length()/2; i++) {
		if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-1-i)) {
			System.out.println(palindrome+ " String is not Palindrome");
		}
		else {
			System.out.println(palindrome+ " String is Palindrome");
		}
	}
	
	
	scanner.close();
}
}
