package com.techlabs.PredicateExamples.test;

import java.util.function.Predicate;

public class NonEmptyString {
	
	public static void main(String[] args) {
		
		Predicate<String> noEmpty = input -> input.isEmpty();
		try {
			System.out.println(noEmpty.test(""));
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
