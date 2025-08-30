package com.techlabs.streamfilter.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	public static void main(String[] args) {
		
		List<Integer> student = Arrays.asList(12, 23, 34, 45, 56, 67, 78, 89, 90);
		
		List<Integer> marks = student.stream().filter(i -> i>= 60).collect(Collectors.toList());
		System.out.println(marks);
	}
}
