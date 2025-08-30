package com.techlabs.PredicateExamples.test;

import java.util.function.BiPredicate;

public class StudentPassFilter {

	public static void main(String[] args) {
		
		BiPredicate<String, Integer> student = (name, marks) -> marks >= 40;
		System.out.println(student.test("Ashwini", 80));
		System.out.println(student.test("John", 30));
	}
}
