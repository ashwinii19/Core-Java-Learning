package com.techlabs.streamfilter.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(list);
		
		//Even Numbers
		System.out.println("Even Numbers: ");
		List<Integer> streamObject = list.stream().filter(i ->i % 2 == 0).collect(Collectors.toList());
		System.out.println(streamObject);
		
		//Odd Numbers
		list.stream().filter(i -> i % 2 == 1).collect(Collectors.toList()).forEach(System.out::println);
	}

}
