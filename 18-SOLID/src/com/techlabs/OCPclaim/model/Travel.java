package com.techlabs.OCPclaim.model;

public class Travel implements IClaimProcessor{

	@Override
	public String insuranceClaim() {
		return "Travel insurance claim";
	}

}