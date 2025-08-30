package com.techlabs.whileloops.test;

public class PalindromNumber {
	public static void main(String args[]) {
		
		int number = 121;
		int reversed = 0;
		int temporary = number;
		
		
		while(temporary != 0) {
			int digit = temporary % 10;
			reversed = (reversed * 10)+ digit;
			temporary /= 10;
		}
		
		if(number == reversed) {
			System.out.println("Palindrom Number");
		}
		else {
			System.out.println("Not Palindrom Number");
		}
	}
}
