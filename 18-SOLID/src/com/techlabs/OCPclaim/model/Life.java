package com.techlabs.OCPclaim.model;

public class Life implements IClaimProcessor{

	@Override
	public String insuranceClaim() {
		return "Life insurance claim";
	}

}
