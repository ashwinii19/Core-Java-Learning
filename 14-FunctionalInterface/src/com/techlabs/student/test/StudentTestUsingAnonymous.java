package com.techlabs.student.test;

import com.techlabs.student.model.IStudent;

public class StudentTestUsingAnonymous {

	public static void main(String[] args) {
		
		IStudent student = new IStudent() {
			
			@Override
			public void greed() {
				System.out.println("Hello Java");
			}
		};
		student.greed();
		
		IStudent student2 = new IStudent() {
			
			@Override
			public void greed() {
				System.out.println("Hello World");
			}
		};
		student2.greed();
	}
}
