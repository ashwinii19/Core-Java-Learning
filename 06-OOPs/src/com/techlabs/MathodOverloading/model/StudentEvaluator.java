package com.techlabs.MathodOverloading.model;

public class StudentEvaluator {

	public void evaluate(int marks) {
		System.out.println("Marks of a Student: "+marks);
		if(marks >= 90) {
			System.out.println("Excellent");
		}
		else {
			System.out.println("Keep Trying");
		}
	}
	
	public String evaluate(int marks, int totalMarks) {
		double percentage = (marks * 100.0)/totalMarks;
		if(percentage >= 90) {
			return "A";
		}
		else if(percentage >= 75) {
			return "B";
		}
		else if(percentage >= 50) {
			return "C";
		}
		else {
			return "D";
		}
		
	}
	
	public String evaluate(String grade) {
		switch(grade) {
		
		case "A":
			return "Excellent";
			
		case "B":
			return "Good";
			
		case "C":
			return "Needs Improvement";
			
		}
		return grade;
	}
}
