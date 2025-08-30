package com.techlabs.streamlimit.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitDemo {

public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12, 3, 4, 678, 976, 32, 600, 700, 800);
		System.out.println("Filter even numbers, limit to the first 4 even numbers, and calculate their total.");
		System.out.println(list.stream().filter(n -> n % 2 == 0).limit(4).collect(Collectors.summingInt(Integer::intValue)));
		System.out.println(list.stream().filter(n -> n % 2 == 0).limit(4).reduce(0, (a, b) -> a+b));
	}
}
