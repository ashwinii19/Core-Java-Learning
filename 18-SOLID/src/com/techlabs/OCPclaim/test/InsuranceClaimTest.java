package com.techlabs.OCPclaim.test;

import java.util.Scanner;

import com.techlabs.OCPclaim.model.Health;
import com.techlabs.OCPclaim.model.Life;
import com.techlabs.OCPclaim.model.Property;
import com.techlabs.OCPclaim.model.Travel;
import com.techlabs.OCPclaim.model.Vehicle;

public class InsuranceClaimTest {

	public static void main(String[] args) {
		
		ClaimType claim = new ClaimType();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the choice: \n1.Life\n2.Vehicle\n3.Health\n4.Travel\n5.Property");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("Claim Type: "+claim.claimType(new Life()));
			break;
			
		case 2: 
			System.out.println("Claim Type: "+claim.claimType(new Vehicle()));
			break;
			
		case 3: 
			System.out.println("Claim Type: "+claim.claimType(new Health()));
			break;
			
		case 4:
			System.out.println("Claim Type: "+claim.claimType(new Travel()));
			break;
			
		case 5:
			System.out.println("Claim Type: "+claim.claimType(new Property()));
			break;
		}
		
	}
}
