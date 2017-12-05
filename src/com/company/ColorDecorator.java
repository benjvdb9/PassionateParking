package com.company;

import java.util.ArrayList;

class ColorDecorator extends Decorator {
    private Color color;

    public ColorDecorator(Vehicle vehicle, Color color) {
        super(vehicle);
        this.color = color;
    }

    @Override
    public ArrayList vehicleCharacteristic() {
        ArrayList array = super.vehicleCharacteristic();
        array.add(this.color);
        return array;
    }
}