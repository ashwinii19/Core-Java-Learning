package com.techlabs.typesoffunctionalinterface.test;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> isEvenChecker = input -> input % 2 ==0;
		System.out.println(isEvenChecker.test(24));
		
		Predicate<String> isEmpty = input2 -> input2.isEmpty();
		try {
			System.out.println(isEmpty.test(""));
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		
	}
}
