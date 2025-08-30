package com.techlabs.statickeyword.model;

public class ElectricityBill {

	private int apartmentNumber;
	private int unitsConsumed;
	private static double costPerUnit = 5.0;
	
	public ElectricityBill(int apapartmentNumber, int unitsConsumed) {
		this.apartmentNumber = apapartmentNumber;
		this.unitsConsumed = unitsConsumed;
	}
	
	public double calculateBill() {
		return unitsConsumed * costPerUnit;
	}
	
	public static void setCostPerUnits(double newRate) {
		costPerUnit = newRate;
	}
	
	public static void displayCurrentRate() {
		System.out.println("Current Cost Per Unit: "+costPerUnit);
	}
	
	public void displayBill() {
		System.out.println("--------------------------------------------");
		System.out.println("Apartment Number: "+apartmentNumber);
		System.out.println("Units consumed: "+unitsConsumed);
		System.out.println("Bill Amount: "+calculateBill());
	}
}
