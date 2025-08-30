package com.techlabs.Transportation.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.techlabs.Transportation.model.Bike;
import com.techlabs.Transportation.model.Car;
import com.techlabs.Transportation.model.Truck;
import com.techlabs.Transportation.model.IVehicleControl;

public class Vehiclestest {

    static class VehicleState {
        IVehicleControl vehicle;
        boolean started = false;
        boolean isRunning = false;
        int lastGear = -1;
        boolean stoppedBeforeExit = false;

        VehicleState(IVehicleControl vehicle) {
            this.vehicle = vehicle;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        HashMap<String, VehicleState> vehicleMap = new HashMap<>();
        vehicleMap.put("Car", new VehicleState(new Car()));
        vehicleMap.put("Bike", new VehicleState(new Bike()));
        vehicleMap.put("Truck", new VehicleState(new Truck()));

        while (!exit) {
            System.out.println("\nSelect Vehicle Type:");
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.println("3. Truck");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                VehicleState currentState = null;

                if (choice == 1) {
                    currentState = vehicleMap.get("Car");
                    System.out.println("Car selected.");
                } else if (choice == 2) {
                    currentState = vehicleMap.get("Bike");
                    System.out.println("Bike selected.");
                } else if (choice == 3) {
                    currentState = vehicleMap.get("Truck");
                    System.out.println("Truck selected.");
                } else if (choice == 4) {
                    System.out.println("Exiting. Goodbye!");
                    exit = true;
                    continue;
                } else {
                    System.out.println("Invalid choice. Try again.");
                    continue;
                }

                boolean back = false;
                while (!back) {
                    System.out.println("\n1. Start Vehicle");
                    System.out.println("2. Stop Vehicle");
                    System.out.println("3. Change Gear");
                    System.out.println("4. Back to Main Menu");
                    System.out.print("Enter your choice: ");

                    if (scanner.hasNextInt()) {
                        int option = scanner.nextInt();
                        scanner.nextLine();

                        switch (option) {
                            case 1:
                                if (currentState.isRunning) {
                                    System.out.println("Vehicle is already started.");
                                } else {
                                    currentState.vehicle.start();
                                    currentState.started = true;
                                    currentState.isRunning = true;
                                    currentState.stoppedBeforeExit = false;
                                }
                                break;
                            case 2:
                                if (!currentState.isRunning) {
                                    System.out.println("Vehicle is already stopped.");
                                } else {
                                    currentState.vehicle.stop();
                                    currentState.isRunning = false;
                                    currentState.stoppedBeforeExit = true;
                                }
                                break;
                            case 3:
                                if (!currentState.isRunning) {
                                    System.out.println("Please start the vehicle before changing gear.");
                                    break;
                                }

                                boolean changeAgain = true;
                                while (changeAgain) {
                                    System.out.print("Enter gear: ");
                                    if (scanner.hasNextInt()) {
                                        int gear = scanner.nextInt();
                                        scanner.nextLine();

                                        if (gear == -1 && currentState.vehicle instanceof Bike) {
                                            System.out.println("Reverse gear is not available for Bike.");
                                        } else {
                                            currentState.vehicle.changeGear(gear);
                                            currentState.lastGear = gear;
                                        }

                                        while (true) {
                                            System.out.print("Do you want to change gear again? (yes/no): ");
                                            String response = scanner.nextLine().trim().toLowerCase();

                                            if (response.equals("yes") || response.equals("y")) {
                                                break;
                                            } else if (response.equals("no") || response.equals("n")) {
                                                changeAgain = false;
                                                break;
                                            } else {
                                                System.out.println("Invalid input! Please type yes/no.");
                                            }
                                        }
                                    } else {
                                        System.out.println("Invalid input! Please enter a number.");
                                        scanner.next();
                                    }
                                }
                                break;
                            case 4:
                                back = true;
                                System.out.println("Returning to main menu.");
                                System.out.println("Summary:");
                                System.out.println("Vehicle: " + currentState.vehicle.getClass().getSimpleName());
                                System.out.println("Started: " + (currentState.started ? "Yes" : "No"));
                                System.out.println("Stopped: " + (currentState.stoppedBeforeExit ? "Yes" : "No"));
                                System.out.println("Last Gear Changed: " + (currentState.lastGear != -1 ? currentState.lastGear : "Not changed"));
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter a number.");
                        scanner.next();
                    }
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
        }

        scanner.close();
    }
}