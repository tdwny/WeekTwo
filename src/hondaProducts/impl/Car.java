package hondaProducts.impl;

import hondaProducts.Automobile;

public class Car implements Automobile {

    //Local Variables
    boolean hasEngine = true;
    int numberOfDoors;
    int numberOfSeats;
    String color;
    boolean retractableRoof;

    //Constructor
    public Car(int numberOfDoors, int numberOfSeats, String color, boolean retractableRoof) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.color = color;
        this.retractableRoof = retractableRoof;
    }

    //Getters & Setters
    public boolean isHasEngine() {
        return hasEngine;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRetractableRoof() {
        return retractableRoof;
    }

    public void setRetractableRoof(boolean retractableRoof) {
        this.retractableRoof = retractableRoof;
    }

    //Methods
    @Override
    public String drive() {
        return "This car is driving";
    }
}
