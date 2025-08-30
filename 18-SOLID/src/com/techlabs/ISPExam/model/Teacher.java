package com.techlabs.ISPExam.model;

public class Teacher implements ITeacher{

	@Override
	public void createQuestionBank() {
		System.out.println("[Teacher] Create Question Bank...");
	}

	@Override
	public void gradeExam(int marks) {
		System.out.println("[Teacher] Grading Exam based on marks: "+marks);
		String grade;
		
		if(marks >= 90) {
			grade = "A+";
		}else if(marks >= 80) {
			grade = "A";
		}else if(marks >= 70) {
			grade = "B";
		}else if(marks >= 60) {
			grade = "C";
		}else if(marks >= 50) {
			grade = "D";
		}else {
			grade = "Fail";
		}
		
		System.out.println("[Teacher] Grade assigned: "+grade);
	}
}
