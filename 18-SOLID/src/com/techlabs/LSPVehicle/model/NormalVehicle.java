package com.techlabs.LSPVehicle.model;

public class NormalVehicle implements IReFuel{

	@Override
	public void reFuel() {
		System.out.println("Vehicle Refueled");
	}

}
