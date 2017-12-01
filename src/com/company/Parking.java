package com.company;

public class Parking {
    private Parking() {}

    private static class ParkingHolder {
        private static final Parking INSTANCE = new Parking();
    }

    public static Parking getInstance() {
        return ParkingHolder.INSTANCE;
    }
}