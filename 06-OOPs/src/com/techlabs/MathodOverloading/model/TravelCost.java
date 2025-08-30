package com.techlabs.MathodOverloading.model;

public class TravelCost {

	public int estimate(int distance) {
		int cost = distance * 10;
		return cost;
	}
	
	public int estimate(int distance, int passengers) {
		int cost = distance * 10;
		if(passengers > 1) {
			cost *= passengers;
		}
		return cost;
	}
	
	public int estimate(int distance, int passengers, boolean AC) {
		int cost = distance * 10;
		if(passengers > 1) {
			cost *= passengers;
		}
		if(AC) {
			cost += cost*0.20;
		}
		return cost;
	}
}
