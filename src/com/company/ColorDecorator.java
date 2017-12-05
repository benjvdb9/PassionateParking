package com.company;

import java.util.ArrayList;

/*
* Class to implement methods of decorator.
* Color color: color of vehicle.
 */
class ColorDecorator extends Decorator {
    private Color color;

    //Constructor.
    public ColorDecorator(Vehicle vehicle, Color color) {
        super(vehicle);
        this.color = color;
    }

    //Add color to the array of characteristic's vehicle
    @Override
    public ArrayList vehicleCharacteristic() {
        ArrayList array = super.vehicleCharacteristic();
        array.add(this.color);
        return array;
    }
}