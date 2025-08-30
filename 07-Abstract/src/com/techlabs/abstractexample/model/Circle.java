package com.techlabs.abstractexample.model;

public class Circle extends Shape{

	public Circle(String shapeName) {
		super(shapeName);
	}
	
	@Override
	public void display() {
		System.out.println("Display "+shapeName+" ...");
	}

}
