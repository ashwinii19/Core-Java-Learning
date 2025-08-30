package com.techlabs.educationexamsystem.model;

public class TheoryExam implements IExamEvaluator {

	int marks;

	public TheoryExam(int marks) {
		super();
		this.marks = marks;
	}

	@Override
	public void evaluateMarks() {
		System.out.println("Evaluating Theory Exam Marks: "+marks);
	}

	@Override
	public String calculateGrade() {
		if(marks >= 90) {
			return "A+";
		}
		else if(marks >= 75) {
			return "A";
		}
		else if(marks >= 60) {
			return "B";
		}
		else if(marks >= 40) {
			return "C";
		}
		else {
			return "F";
		}
	}

	
	
}
