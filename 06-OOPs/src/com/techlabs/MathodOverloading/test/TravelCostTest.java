package com.techlabs.MathodOverloading.test;

import com.techlabs.MathodOverloading.model.TravelCost;

public class TravelCostTest {

	public static void main(String[] args) {
		
		TravelCost travelcost = new TravelCost();
		System.out.println("Distance only: "+travelcost.estimate(500));
		System.out.println("Distance + Passengers: "+travelcost.estimate(500, 2));
		System.out.println("Distance + Passengers + AC: "+travelcost.estimate(500, 2, true));
	}
}
