package com.techlabs.streamminmax.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12, 3, 4, 678, 976, 32);
		System.out.println("Smallest number");
		list.stream().min(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
		
		System.out.println("--------------------");
		System.out.println("String Maximum Name Length");
		List<String> name = Arrays.asList( "Durgesh", "Ashwini", "Jayesh", "Akash");
		name.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::println);
		
		System.out.println("--------------------");
		System.out.println("Highest Marks scored by Student");
		list.stream().max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
		
		System.out.println("--------------------");
		System.out.println("Largest Even Number from list");
		list.stream().filter(i -> i % 2 == 0).max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
	}
}
