package com.techlabs.streamcount.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamString {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Ashwini", "Jayesh", "Durgesh", "Akash", "Jayesh", "jayesh");
		System.out.println(list);

		List<String> names1 = list.stream().map(name -> name.toUpperCase()).filter(n -> n.startsWith("J")).distinct().collect(Collectors.toList());
		System.out.println(names1);
		
		long names = list.stream().map(name -> name.toUpperCase()).filter(n->n.startsWith("J")).count();
		System.out.println(names);
	}
}
