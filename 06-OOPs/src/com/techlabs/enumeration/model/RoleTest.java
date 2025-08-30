package com.techlabs.enumeration.model;

public class RoleTest {

	public static void grantAccess(Role role) { // role object pass

		switch (role) {
		case USER:
			System.out.println("Access to Dashboard");
			break;

		case ADMIN:
			System.out.println("Access to User and Dashboard");
			break;

		case MANAGER:
			System.out.println("Access to Everything");
			break;
		}
		
	}
	
	public static void main(String[] args) {
		
		grantAccess(Role.ADMIN);
		
	}
}
