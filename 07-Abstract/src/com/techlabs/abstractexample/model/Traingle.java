package com.techlabs.abstractexample.model;

public class Traingle extends Shape{
	
	public Traingle(String shapeName) {
		super(shapeName);
	}
	
	@Override
	public void display() {
		
		System.out.println("Display "+shapeName+"...");
	}

}
