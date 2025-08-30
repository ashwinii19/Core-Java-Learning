package com.techlabs.test;

public class WrapperClass {
	public static void main(String[] args) {
		
		int number1 = 20;
//		Integer number1 = new Integer(number1);   //boxing
		Integer number2 = number1;  //auto-boxing
		
		boolean bool3 = true;
		Boolean bool4 = bool3;
		
		System.out.println("number1: "+number1);
		System.out.println("number2: "+number2);
		System.out.println("Boolean3: "+bool3);
		System.out.println("Boolean2: "+bool4);
		System.out.println(bool3 == bool4);
		
		int number5 = number2.intValue(); //unboxing
		int number6 = number2;   //auto-unboxing
		System.out.println("number5: "+number5);
		System.out.println("number6: "+number6);
		
	}
}
