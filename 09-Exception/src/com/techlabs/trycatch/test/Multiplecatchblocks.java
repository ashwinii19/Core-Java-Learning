package com.techlabs.trycatch.test;

public class Multiplecatchblocks {

	public static void main(String[] args) {
		
		String[] string = new String[2];
		try {
			
			for(int i=0; i<string.length; i++) {
				System.out.println(string[6]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}
