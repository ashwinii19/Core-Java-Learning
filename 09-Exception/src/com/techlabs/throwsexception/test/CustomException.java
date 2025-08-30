package com.techlabs.throwsexception.test;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) throws InvalidPasswordException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Password: ");
		String pwd = scanner.nextLine();

		try {
			if (pwd.length() < 8) {
				throw new InvalidPasswordException("Enter the password greater than 8");
			}
		} catch (InvalidPasswordException e) {
			System.out.println(e);
			System.exit(0);
		}
		System.out.println("Password Successfull");
	}

}
