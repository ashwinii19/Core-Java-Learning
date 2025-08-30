package com.techlabs.MathodOverloading.model;

public class AreaCalculator {

	
	int side;
	int length;
	int breadth;
	double radius;
	
	public void area(int side) {
		System.out.println("Area of Square: "+side*side);
	}
	
	public void area(int length, int breadth) {
		System.out.println("Area of Rectangle: "+length*breadth);
	}
	
	public void area(double radius) {
		System.out.println("Area of Circle: "+(3.14*radius*radius));
	}
}
