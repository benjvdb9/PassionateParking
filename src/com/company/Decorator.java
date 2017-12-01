package com.company;


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
}