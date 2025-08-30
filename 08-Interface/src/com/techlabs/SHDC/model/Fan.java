package com.techlabs.SHDC.model;

public class Fan implements IControllable {

	public void turnOn() {
		System.out.println("Fan turn On");
	}
	
	public void turnOff() {
		System.out.println("Fan turn Off");
	}
	
	public void setMode(String mode) {
			System.out.println("Fan mode set to: "+mode);
	}
}
