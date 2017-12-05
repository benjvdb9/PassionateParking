package com.company;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Place> places = new ArrayList<>();

    private Parking() {
        this.places = places;
    }

    private static class ParkingHolder {
        private static final Parking INSTANCE = new Parking();
    }

    public static Parking getInstance() {
        return ParkingHolder.INSTANCE;
    }

    public ArrayList<Place> getPlaces() {
        return this.places;
    }

    public void addPlace(Place place) {
        this.places.add(place);
    }

    public ArrayList<Place> getEmptyPlace() {
        ArrayList empty_places = new ArrayList();
        Place place;

        for (int i = 0; i < this.places.size(); i++) {
            place = this.places.get(i);
            if (place.isFree() == true) {
                empty_places.add(this.places.get(i));
            }
        }
        return empty_places;
    }

    public ArrayList<Place> getBusyPlaces() {
        ArrayList busy_places = new ArrayList();
        Place place;

        for (int i = 0; i < this.places.size(); i++) {
            place = this.places.get(i);
            if (place.isFree() == false) {
                busy_places.add(this.places.get(i));
            }
        }
        return busy_places;
    }
}