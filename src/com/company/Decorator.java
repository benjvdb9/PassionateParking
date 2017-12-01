package com.company;


import java.util.ArrayList;

abstract class Decorator implements Vehicle {
    private Vehicle vehicle;

    public Decorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String type() {
        return vehicle.type();
    }

    @Override
    public String licensePlate() {
        return vehicle.licensePlate();
    }

    @Override
    public ArrayList vehicleCharacteristic() {
        return vehicle.vehicleCharacteristic();
    }
}