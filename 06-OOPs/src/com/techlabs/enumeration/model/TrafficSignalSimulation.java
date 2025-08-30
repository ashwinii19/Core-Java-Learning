package com.techlabs.enumeration.model;

public class TrafficSignalSimulation {

	public static void main(String[] args) {
		
	
	TrafficSignal trafficlight = TrafficSignal.GREEN;
		
		switch(trafficlight) {
		
		case RED:
			System.out.println("Stop");
			break;
			
		case YELLOW:
			System.out.println("Get Ready");
			break;
			
		case GREEN:
			System.out.println("Go");
			break;
		}
		
		for(TrafficSignal trafficSignal : trafficlight.values()) {
			System.out.println(trafficSignal);
		}
		
	}
}
	

