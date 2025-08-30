package com.techlabs.Transportation.model;

public class Car implements IVehicleControl {
    private boolean isStarted = false;
    private int currentGear = 0;

    public void start() {
        if (isStarted) {
            System.out.println("Car is already started.");
        } else {
            isStarted = true;
            System.out.println("Car started.");
        }
    }

    public void stop() {
        if (!isStarted) {
            System.out.println("Car is already stopped.");
        } else {
            isStarted = false;
            currentGear = 0;
            System.out.println("Car stopped. Gear reset to 0.");
        }
    }

    public void changeGear(int gear) {
        if (!isStarted) {
            System.out.println("Car is not started. Cannot change gear.");
            return;
        }
        if (gear < 1 || gear > 5) {
            System.out.println("Invalid gear. Car has gears 1-5.");
        } else {
            currentGear = gear;
            System.out.println("Car gear changed to " + gear);
        }
    }
}
