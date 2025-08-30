package com.techlabs.FunctionExamples.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StudentGradeGenerator {

	public static void main(String[] args) {
		
		Function<Integer, String> studentGrade = marks -> {
			if(marks >= 75) return "A";
			else if(marks >= 50) return "B";
			else return "Fail";
		};
		
		//Declares an array
		int[] markslist = {85, 67, 45, 90, 50};
		
		for(int marks : markslist) {
			System.out.println("Marks: "+marks + " -> Grade: "+studentGrade.apply(marks));
		}
		
		
		
		
	}
}
