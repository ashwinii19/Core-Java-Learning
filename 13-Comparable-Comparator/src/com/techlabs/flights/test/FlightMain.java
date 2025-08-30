package com.techlabs.flights.test;

import java.util.ArrayList;
import java.util.Collections;

import com.techlabs.flights.model.Flight;
import com.techlabs.flights.model.FlightSortDescendingfare;

public class FlightMain {

	public static void main(String[] args) {
		
		ArrayList<Flight> flight =new ArrayList<Flight>();
		
		flight.add(new Flight("Air India",1500.0));
		flight.add(new Flight("Indigo ",2500.0));
		flight.add(new Flight("Spice Jet",1200.0));
		flight.add(new Flight("Etihad",4500.0));
		
		Collections.sort(flight, new FlightSortDescendingfare());
		
		System.out.println("Fare in descending order (highest fare first).");	
		for(Flight res : flight) {
			System.out.println("\nAirline : "+res.getAirline()+" , Fare : "+res.getFare()+" INR. ");
		}
	
		
	}
}
