package com.techlabs.test;

public class Increment {
	public static void main(String args[]) {
		int a = 10;
		int b= ++a;
		
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		
		int x = 20;
		int y= x++;
		
		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
	}
}
