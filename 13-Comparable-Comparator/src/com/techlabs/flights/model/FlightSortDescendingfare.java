package com.techlabs.flights.model;

import java.util.Comparator;

public class FlightSortDescendingfare implements Comparator<Flight>{

	@Override
	public int compare(Flight flight1, Flight flight2) {
		return Double.compare(flight2.fare, flight2.fare);
	}

	
}
