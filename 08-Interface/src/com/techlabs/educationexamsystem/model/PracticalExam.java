package com.techlabs.educationexamsystem.model;

public class PracticalExam implements IExamEvaluator{
 
	int performanceScore;

	public PracticalExam(int performanceScore) {
		super();
		this.performanceScore = performanceScore;
	}

	@Override
	public void evaluateMarks() {
		System.out.println("Evaluating Practical Exam Score: "+performanceScore);
	}

	@Override
	public String calculateGrade() {
		if(performanceScore >= 85) {
			return "Excellent";
		}
		else if(performanceScore >= 70) {
			return "Good";
		}
		else if(performanceScore >= 50) {
			return "Average";
		}
		else {
			return "Fail";
		}
	}	
}
