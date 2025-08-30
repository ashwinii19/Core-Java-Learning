package com.techlabs.model;

public class GradeValidator {

	public boolean isGradeValidator(int grade) {
		return grade >= 0 && grade <= 100;
	}

	public String getGradeCategory(int grade) {
		if (grade < 50) {
			return "Fail";
		} else if (grade <= 74) {
			return "Pass";
		} else {
			return "Distinction";
		}
	}

}
