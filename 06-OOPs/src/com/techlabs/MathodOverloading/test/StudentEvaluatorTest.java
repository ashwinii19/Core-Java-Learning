package com.techlabs.MathodOverloading.test;

import com.techlabs.MathodOverloading.model.StudentEvaluator;

public class StudentEvaluatorTest {

	public static void main(String[] args) {
		
		StudentEvaluator evaluator = new StudentEvaluator();
		evaluator.evaluate(92);
		System.out.println("Grade: "+evaluator.evaluate(92, 100));
		System.out.println("feedback: "+evaluator.evaluate("A"));
	}
}
