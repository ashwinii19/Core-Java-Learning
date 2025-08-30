package com.techlabs.SHDC.model;

public class Light implements IControllable{

	public void turnOn() {
		System.out.println("Light turn On");
	}
	
	public void turnOff() {
		System.out.println("Light turn Off");
	}
	
	public void setMode(String mode) {
			System.out.println("Light mode set to: "+mode);
	}
}
