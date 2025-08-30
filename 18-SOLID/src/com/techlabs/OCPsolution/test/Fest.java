package com.techlabs.OCPsolution.test;

import com.techlabs.OCPclaim.model.IClaimProcessor;
import com.techlabs.OCPsolution.model.IFestivalInterest;

public class Fest {

	public double festType(IFestivalInterest festivalInterest) {
		return festivalInterest.getInterestRate();
	}
}
