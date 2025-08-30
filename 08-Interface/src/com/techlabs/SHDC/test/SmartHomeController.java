package com.techlabs.SHDC.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.techlabs.SHDC.model.IControllable;
import com.techlabs.SHDC.model.Fan;
import com.techlabs.SHDC.model.Light;
import com.techlabs.SHDC.model.Speaker;
import com.techlabs.SHDC.model.TV;

public class SmartHomeController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Boolean> deviceStatus = new HashMap<>();
        Map<String, String> deviceMode = new HashMap<>();

        System.out.println("Welcome to your Smart Home Controller!");
        System.out.println("--------------------------------------");
        System.out.println("You can control: Light, Fan, TV, Speaker");
        System.out.println("Type 'exit' anytime to close the program.\n");

        while (true) {
            IControllable device = null;
            String deviceName = "";
            String displayName = "";

            System.out.print("Enter device name (Light, Fan, TV, Speaker or 'exit'): ");
            deviceName = scanner.nextLine().trim().toLowerCase();

            if (deviceName.equals("exit")) {
                System.out.println("\nExiting Smart Home Controller. Goodbye!");
                break;
            }

            if (deviceName.equals("light")) {
                device = new Light();
                displayName = "Light";
            } else if (deviceName.equals("fan")) {
                device = new Fan();
                displayName = "Fan";
            } else if (deviceName.equals("tv")) {
                device = new TV();
                displayName = "TV";
            } else if (deviceName.equals("speaker")) {
                device = new Speaker();
                displayName = "Speaker";
            } else {
                System.out.println("Invalid device. Please try again.\n");
                continue;
            }

            deviceStatus.putIfAbsent(deviceName, false);
            boolean isOn = deviceStatus.get(deviceName);

            while (true) {
                System.out.print("Do you want to turn " + displayName + " ON or OFF? (on/off): ");
                String action = scanner.nextLine().trim().toLowerCase();

                if (action.equals("on")) {
                    if (isOn) {
                        System.out.println(displayName + " is already ON.");
                    } else {
                        device.turnOn();
                        isOn = true;
                        deviceStatus.put(deviceName, true);

                        while (true) {
                            if (deviceName.equals("light")) {
                                System.out.println("Light Modes: Dim, Bright");
                            } else if (deviceName.equals("fan")) {
                                System.out.println("Fan Modes: Low, Medium, High");
                            } else if (deviceName.equals("tv")) {
                                System.out.println("TV Modes: HD, SD");
                            } else if (deviceName.equals("speaker")) {
                                System.out.println("Speaker Modes: Bass, Treble");
                            }

                            System.out.print("Enter mode: ");
                            String mode = scanner.nextLine().trim();

                            boolean valid = false;
                            if (deviceName.equals("light")) {
                                valid = mode.equalsIgnoreCase("dim") || mode.equalsIgnoreCase("bright");
                            } else if (deviceName.equals("fan")) {
                                valid = mode.equalsIgnoreCase("low") || mode.equalsIgnoreCase("medium") || mode.equalsIgnoreCase("high");
                            } else if (deviceName.equals("tv")) {
                                valid = mode.equalsIgnoreCase("hd") || mode.equalsIgnoreCase("sd");
                            } else if (deviceName.equals("speaker")) {
                                valid = mode.equalsIgnoreCase("bass") || mode.equalsIgnoreCase("treble");
                            }

                            if (valid) {
                                device.setMode(mode);
                                deviceMode.put(deviceName, mode);
                                break;
                            } else {
                                System.out.println("Invalid mode. Try again.");
                            }
                        }

                        while (true) {
                            System.out.print("Change " + displayName + " mode? (yes/no): ");
                            String change = scanner.nextLine().trim().toLowerCase();

                            if (change.equals("yes") || change.equals("y")) {
                                System.out.print("Enter new mode: ");
                                String newMode = scanner.nextLine().trim();
                                device.setMode(newMode);
                                deviceMode.put(deviceName, newMode);
                            } else if (change.equals("no") || change.equals("n")) {
                                break;
                            } else {
                                System.out.println("Please enter yes/no.");
                            }
                        }
                    }
                } else if (action.equals("off")) {
                    if (!isOn) {
                        System.out.println(displayName + " is already OFF.");
                    } else {
                        System.out.print("Are you sure you want to turn off the " + displayName + "? (yes/no): ");
                        String confirm = scanner.nextLine().trim().toLowerCase();

                        if (confirm.equals("yes") || confirm.equals("y")) {
                            device.turnOff();
                            isOn = false;
                            deviceStatus.put(deviceName, false);
                        } else if (!(confirm.equals("no") || confirm.equals("n"))) {
                            System.out.println("Invalid input. Please enter yes/no.");
                        }
                    }
                } else {
                    System.out.println("Invalid input. Please type 'on' or 'off'.");
                }

                System.out.print("\nContinue with same device? (yes/no): ");
                String cont = scanner.nextLine().trim().toLowerCase();

                if (cont.equals("no") || cont.equals("n")) {
                    if (isOn) {
                        System.out.print("Before switching, turn off " + displayName + "? (yes/no): ");
                        String offNow = scanner.nextLine().trim().toLowerCase();

                        if (offNow.equals("yes") || offNow.equals("y")) {
                            device.turnOff();
                            isOn = false;
                            deviceStatus.put(deviceName, false);

                            System.out.println("\n--- Summary ---");
                            System.out.println(displayName + " turned ON");
                            System.out.println(displayName + " mode set to: " + deviceMode.getOrDefault(deviceName, "Not Set"));
                            System.out.println(displayName + " turned OFF\n");
                        } else if (offNow.equals("no") || offNow.equals("n")) {
                            deviceStatus.put(deviceName, true);
                        } else {
                            System.out.println("Invalid input. Skipping.");
                        }
                    }

                    System.out.println("--------------------------------------\n");
                    break; 
                } else if (!(cont.equals("yes") || cont.equals("y"))) {
                    System.out.println("Invalid input. Continuing with same device.\n");
                }

                deviceStatus.put(deviceName, isOn);
            }
        }

        scanner.close();
    }
}