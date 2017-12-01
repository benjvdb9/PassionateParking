package com.company;

public class Place {
    private Size size_place;
    private Vehicle vehicle;
    private boolean free;

    public Place(Size size) {
        this.vehicle = null;
        this.size_place = size;
        this.free = true;
    }

    public void setBusy(Vehicle vehicle) {
        this.free = false;
        this.vehicle = vehicle;
    }

    public void setFree(Vehicle vehicule) {
        this.free = true;
        this.vehicle = null;
    }

    public double getPrice(){
        double price = 0;
        return price;
    }
}
