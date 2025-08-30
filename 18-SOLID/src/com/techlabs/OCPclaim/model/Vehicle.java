package com.techlabs.OCPclaim.model;

public class Vehicle implements IClaimProcessor{

	@Override
	public String insuranceClaim() {
		return "Vehicle insurance claim";
	}

}
