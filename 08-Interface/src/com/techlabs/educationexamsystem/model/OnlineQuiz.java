package com.techlabs.educationexamsystem.model;

public class OnlineQuiz implements  IExamEvaluator{

	int correctAnswer;

	public OnlineQuiz(int correctAnswer) {
		super();
		this.correctAnswer = correctAnswer;
	}

	@Override
	public void evaluateMarks() {
		System.out.println("Evaluating Online Quiz Correct Answer: "+correctAnswer);		
	}

	@Override
	public String calculateGrade() {
		if(correctAnswer >= 9) {
			return "OutStanding";
		}
		else if(correctAnswer >= 7) {
			return "Very Good";
		}
		else if(correctAnswer >= 5) {
			return "Good";
		}
		else {
			return "Fail";
		}
	}
	
	
}
