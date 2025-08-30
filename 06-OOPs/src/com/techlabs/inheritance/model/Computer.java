package com.techlabs.inheritance.model;

public class Computer extends Device {

	public void category() {
		super.type();
		System.out.println("Computing device");
	}
}
