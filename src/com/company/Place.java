package com.company;

public class Place {
    private Size size;
    private Vehicle vehicle;
    private boolean free;

    public Place(Size size) {
        this.vehicle = null;
        this.size = size;
        this.free = true;
    }

    public void setBusy(Vehicle vehicle) {
        this.free = false;
        this.vehicle = vehicle;
    }
}
