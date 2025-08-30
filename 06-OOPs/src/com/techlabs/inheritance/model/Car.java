package com.techlabs.inheritance.model;

public class Car extends Vehicle{

	public void features() {
		super.start();
		System.out.println("4-wheeler with AC");
	}
}
