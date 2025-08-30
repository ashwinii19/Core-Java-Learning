package com.techlabs.SHDC.model;

public class TV implements IControllable{

	public void turnOn() {
		System.out.println("TV turn On");
	}
	
	public void turnOff() {
		System.out.println("TV turn Off");
	}
	
	public void setMode(String mode) {
			System.out.println("TV mode set to: "+mode);
	}
}
