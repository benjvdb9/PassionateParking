package com.company;

class Truck implements Vehicle {
    private String license_plate;
    private String type;
    private Size size_truck;

    public Truck(String license_plate) {
        this.license_plate = license_plate;
        this.type = "Truck";
        this.size_truck = new Size(260, 1200);
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