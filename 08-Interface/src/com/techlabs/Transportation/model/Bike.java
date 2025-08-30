package com.techlabs.Transportation.model;

public class Bike implements IVehicleControl {
    private boolean isStarted = false;
    private int currentGear = 0;

    public void start() {
        if (isStarted) {
            System.out.println("Bike is already started.");
        } else {
            isStarted = true;
            System.out.println("Bike started.");
        }
    }

    public void stop() {
        if (!isStarted) {
            System.out.println("Bike is already stopped.");
        } else {
            isStarted = false;
            currentGear = 0;
            System.out.println("Bike stopped. Gear reset to 0.");
        }
    }

    public void changeGear(int gear) {
        if (!isStarted) {
            System.out.println("Bike is not started. Cannot change gear.");
            return;
        }
        if (gear < 1 || gear > 4) {
            System.out.println("Invalid gear. Bike has gears 1-4.");
        } else {
            currentGear = gear;
            System.out.println("Bike gear changed to " + gear);
        }
    }
}
