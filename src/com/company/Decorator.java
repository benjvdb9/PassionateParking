package com.company;


abstract class Decorator implements Vehicle {
    private Vehicle vehicle;

    public Decorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}