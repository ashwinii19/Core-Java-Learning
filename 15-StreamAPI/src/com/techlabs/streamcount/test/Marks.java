package com.techlabs.streamcount.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Marks {

	public static void main(String[] args) {
		
		Integer[] marks = {10,20,30,40};
		
		List<Integer> list = Arrays.stream(marks).filter(i -> i>=20).collect(Collectors.toList());
		System.out.println(list);
		
		Stream s = Stream.of(10,20,30,40);
		List<?> result = (List<?>) s.filter(i -> i<40).collect(Collectors.toList());
		System.out.println(result);
	}
}
