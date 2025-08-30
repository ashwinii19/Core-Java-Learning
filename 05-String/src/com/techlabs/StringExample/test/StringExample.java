package com.techlabs.StringExample.test;

import java.util.Scanner;

public class StringExample {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	String s1 = "Hello";
	System.out.println(s1.hashCode());
	String s2 = "Hello";
	System.out.println(s2.hashCode());
	System.out.println(s1 == s2);
	
	
	
	System.out.println("\n\n-----------------------------\n");
	String s3 = new String("Hello");
	System.out.println(s2.hashCode());
	String s4 = new String("Hello World");
	System.out.println(s2.hashCode());
	System.out.println(s3 == s4);
	
	
	scanner.close();
}
}
