package com.techlabs.inheritance.model;

public class Bike extends Vehicle{

	public void features() {
		super.start();
		System.out.println("2-wheeler with Helmet");
	}
}
