package com.company;

/*
* Class Place to represent a place in parking.
* Size size_place : size of place
* Vehicle vehicle : if the place isn't free the have a vehicle.
* bool free: if place free, free=true.
*/

public class Place {
    private Size size_place;
    private Vehicle vehicle;
    private boolean free;

    //Constructor
    public Place(Size size) {
        this.vehicle = null;
        this.size_place = size;
        this.free = true;
    }

    //Check free.
    public boolean isFree() {
        return this.free;
    }

    //Getter.
    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public Size getSizePlace() {
        return size_place;
    }

    //Setter for free or busy.
    public void setBusy(Vehicle vehicle) {
        this.free = false;
        this.vehicle = vehicle;
    }

    public void setFree() {
        this.free = true;
    }

    //Return Price.
    public double getPrice(){
        double price = 0;
        return price;
    }
}
