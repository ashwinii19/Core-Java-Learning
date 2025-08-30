package com.techlabs.PredicateExamples.test;

import java.util.function.Predicate;

public class OddNumberChecker {

	public static void main(String[] args) {
		
		Predicate<Integer> isOddChecker = oddNumber -> oddNumber % 2 == 1;
		System.out.println(isOddChecker.test(13));
	}
}
