package hondaDealer.impl;

import hondaDealer.Dealer;
import hondaProducts.impl.Car;
import hondaProducts.impl.Motorcycle;

import java.util.ArrayList;

public class LocalDealer implements Dealer {

    //Variables
    ArrayList<Car> carInventory;
    ArrayList<Motorcycle> motorcycleInventory;

    //Constructor
    public LocalDealer(ArrayList<Car> carInventory, ArrayList<Motorcycle> motorcycleInventory) {
        this.carInventory = carInventory;
        this.motorcycleInventory = motorcycleInventory;
    }

    //Method
    @Override
    public String sellVehicles() {
        return "This Dealer sells Honda vehicles";
    }
}
