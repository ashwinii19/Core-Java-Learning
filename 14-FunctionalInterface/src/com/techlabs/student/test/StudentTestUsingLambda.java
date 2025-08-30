package com.techlabs.student.test;

import com.techlabs.student.model.IStudent;

public class StudentTestUsingLambda {

	public static void main(String[] args) {
		
		IStudent student = (String msg)-> {return msg;};
		System.out.println(student.display("Ashwini"));
		
		IStudent student2 = (msg)-> msg;
		System.out.println(student2.display("Suresh"));
		
		IStudent student3 = msg -> msg;
		System.out.println(student3.display("Dagale"));
	}
}
