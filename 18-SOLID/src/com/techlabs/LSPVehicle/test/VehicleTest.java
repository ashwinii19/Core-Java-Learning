package com.techlabs.LSPVehicle.test;

import java.util.Scanner;

import com.techlabs.LSPVehicle.model.ElectricalVehicle;
import com.techlabs.LSPVehicle.model.Hybrid;
import com.techlabs.LSPVehicle.model.NormalVehicle;

public class VehicleTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("====== Welcome to the Vehicle System ======");

		
		while(true) {
			System.out.println();
			System.out.println("Choose Vehicle: \n1. Electric Vehicle\n2. Normal Vehicle\n3. Hybrid Vehicle");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1: 
				ElectricalVehicle electricalVehicle = new ElectricalVehicle();
				electricalVehicle.recharge();
				break;
				
			case 2: 
				NormalVehicle normalVehicle = new NormalVehicle();
				normalVehicle.reFuel();
				break;
				
			case 3: 
				Hybrid hybrid = new Hybrid();
				hybrid.recharge();
				hybrid.reFuel();
				break;
			
			default:
				System.out.println("Invalid choice");
				continue;
			}
		}
	}
}
