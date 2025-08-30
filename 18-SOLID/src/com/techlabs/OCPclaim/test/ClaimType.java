package com.techlabs.OCPclaim.test;

import com.techlabs.OCPclaim.model.IClaimProcessor;

public class ClaimType {

	public String claimType(IClaimProcessor claimprocessor) {
		return claimprocessor.insuranceClaim();
	}
}
