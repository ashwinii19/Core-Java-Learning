package com.techlabs.throwsexception.test;

public class InvalidPasswordException extends Exception{

	public InvalidPasswordException() {
		System.out.println("Enter valid Password");
	}
	
	public InvalidPasswordException(String message) {
		super(message);
	}
	
	public void checkPassword(String pwd){
		System.out.println();
	}
	
}
