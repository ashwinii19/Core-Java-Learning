package com.techlabs.OCPclaim.model;

public class Health implements IClaimProcessor{

	@Override
	public String insuranceClaim() {
		return "Health insurance claim";
	}

}
