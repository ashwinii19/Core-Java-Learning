package com.techlabs.Transportation.model;

public class Truck implements IVehicleControl {

	boolean isStarted = false;
	int currentGear =0;
	@Override
	public void start() {
		if(isStarted) {
			System.out.println("Truck is Already Started");
		}
		else {
			isStarted =true;
			System.out.println("Truck Started");
		}
		
	}

	@Override
	public void stop() {
		if(!isStarted ) {
		System.out.println("Truck is Already Stopped");
		}
		else {
			currentGear =0;
			isStarted =false;
			System.out.println("Truck Stopped ,Gear reset to 0");
			
		}
		
	}
	@Override
	public void changeGear(int gear) {
		if(!isStarted) {
			System.out.println("Truck is not Started Cannot Change the Gear");
		}
		 if (gear < 1 || gear > 8) {
	            System.out.println("Invalid gear. Bike has gears 1-4.");
	        } else {
	            currentGear = gear;
	            System.out.println("Bike gear changed to " + gear);
	        }
	}
}