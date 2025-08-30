package com.techlabs.ISPExam.model;

public class Student implements IStudent {

	@Override
	public void startExam() {
		System.out.println("[Student] Starting the Exam");
	}

	@Override
	public void endExam() {
		System.out.println("[Student] Submitting the Exam");
	}

}
