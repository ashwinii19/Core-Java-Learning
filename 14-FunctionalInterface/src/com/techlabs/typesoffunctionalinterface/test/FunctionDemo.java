package com.techlabs.typesoffunctionalinterface.test;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<Integer, Integer> function = s -> s * s;
		System.out.println(function.apply(3));
		
		Function<String, String> function2 = str -> str.toString();
		System.out.println(function2.apply("Helloo"));

	}
}
