package com.techlabs.streamcount.test;

import java.util.Arrays;
import java.util.List;

public class StreamInteger {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 4);
		
		long count = list.stream().filter(i -> i>5).distinct().count();
		System.out.println(count);
	}
}
