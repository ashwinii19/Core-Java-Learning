package com.techlabs.streamskip.test;

import java.util.Arrays;
import java.util.List;

public class SkipDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12, 3, 4, 678, 976, 32, 600, 700, 800);
		System.out.println("The first 2 products priced above ₹500 and printed the rest.");
		list.stream().filter(p -> p>500).skip(2).forEach(System.out::println);
		
		List<String> name = Arrays.asList("Jayesh", "Akash", "Yash","Durgesh", "Ashwini", "Om");
		System.out.println();
		System.out.println("Filter words longer than 3 letters and skip the first 3 of them.");
		name.stream().filter(n -> n.length()>3).skip(3).forEach(System.out::println);
		
	}
}
