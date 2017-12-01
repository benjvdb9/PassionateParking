package com.company;

class Car implements Vehicle {
    private String license_plate;
    private String type;
    private Size size_car;

    public Car(String license_plate) {
        this.license_plate = license_plate;
        this.type = "Car";
        this.size_car = new Size(190, 450);
    }

    @Override
    public String licensePlate() {
        return license_plate;
    }

    @Override
    public String type() {
        return type;
    }


}