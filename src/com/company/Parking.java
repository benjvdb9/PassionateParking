package com.company;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Place> places;

    private Parking() {
        this.places = places;
    }

    private static class ParkingHolder {
        private static final Parking INSTANCE = new Parking();
    }

    public static Parking getInstance() {
        return ParkingHolder.INSTANCE;
    }

    public void addPlace(Place place) {
        this.places.add(place);
    }

    public ArrayList getEmptyPlace() {
        ArrayList empty_place = new ArrayList();
        Place place;

        for (int i = 0; i < this.places.size(); i++) {
            place = this.places.get(i);
            if (place.isFree() == true) {
                empty_place.add(this.places.get(i));

            }
        }
        return empty_place;
    }
}