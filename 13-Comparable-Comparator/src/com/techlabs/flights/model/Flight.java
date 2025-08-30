package com.techlabs.flights.model;

public class Flight {

	String airline;
	double fare;
	
	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public Flight(String airline, double fare) {
		super();
		this.airline = airline;
		this.fare = fare;
	}

}
