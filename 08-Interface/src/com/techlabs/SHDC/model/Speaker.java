package com.techlabs.SHDC.model;

public class Speaker implements IControllable{

	public void turnOn() {
		System.out.println("Speaker turn On");
	}
	
	public void turnOff() {
		System.out.println("Speaker turn Off");
	}
	
	public void setMode(String mode) {
			System.out.println("Speaker mode set to: "+mode);
	}
}
