package hondaProducts.impl;

import hondaProducts.Motorbike;

public class Motorcycle implements Motorbike {

    //Local Variables
    boolean hasEngine = true;
    int numberOfWheels;
    int numberOfSeats;
    String color;

    //Constructor
    public Motorcycle(int numberOfWheels, int numberOfSeats, String color) {
        this.numberOfWheels = numberOfWheels;
        this.numberOfSeats = numberOfSeats;
        this.color = color;
    }

    //Getters & Setters
    public boolean isHasEngine() {
        return hasEngine;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
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

    //Methods
    @Override
    public String ride() {
        return "This motorcycle is being ridden";
    }

    @Override
    public String wheelie() {
        return "Rider is popping a wheelie";
    }
}
