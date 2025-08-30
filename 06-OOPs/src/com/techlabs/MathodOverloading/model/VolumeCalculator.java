package com.techlabs.MathodOverloading.model;

public class VolumeCalculator {

	int side;
	int length, breadth, height;
	double radius;
	
	public void volume(int side) {
		System.out.println("Vloume of Cube: "+(side*side*side));
	}
	
	public void volume(int length, int breadth, int heigth) {
		System.out.println("Cuboid: "+(length*breadth*heigth));
	}
	
	public void volume(double radius) {
		System.out.println("Sphere: "+((4/3)*(3.14)*(radius*radius*radius)));
	}
}
