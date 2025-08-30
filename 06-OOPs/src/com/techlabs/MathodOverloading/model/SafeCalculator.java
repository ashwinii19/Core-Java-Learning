package com.techlabs.MathodOverloading.model;

public class SafeCalculator {
		
	public void divide(int a, int b) {
		if(b == 0) {
			System.out.println("-1");;
		}
		else {
			int e = a/b;
			System.out.println("Divide of a and b: "+e);
		}
		
	}
	
	public void divide(double a, double b) {
		if(b == 0.0) {
			System.out.println("-1");
		}
		else {
			double f =a/b;
			System.out.println("Divide of a and b: "+f);
		}
	}
	
	
	
	
}
