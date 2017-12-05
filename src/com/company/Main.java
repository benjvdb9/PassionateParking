package com.company;

public class Main {
    public static void main (String[] args){
        Parking park = Parking.getInstance();
        Size size = new Size(190, 450);
        Place place = new Place(size);
        Car car = new Car("ABC");
    }
}
