package com.techlabs.abstractexample.model;

public class Square extends Shape{

	public Square(String shapeName) {
		super(shapeName);
	}
	public void display() {
		System.out.println("Display "+shapeName+" ...");
	}

}
