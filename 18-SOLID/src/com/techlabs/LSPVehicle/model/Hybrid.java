package com.techlabs.LSPVehicle.model;

public class Hybrid implements IReFuel, IRecharge{

	@Override
	public void recharge() {
		System.out.println("Vehicle Charge full");
	}

	@Override
	public void reFuel() {
		System.out.println("Vehicle Refueled");
	}

}
