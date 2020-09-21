package test;

import hondaProducts.impl.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CarTest {

    //LocalVariables
    Car car;

    @Before public void initialize(){
        //Object
        car = new Car(2, 4, "blue", true);
    }

    @Test
    public void testCar(){
        //Expected Variables
        boolean hasEngine = true;
        int expectedNumberOfDoors = 2;
        int expectedNumberOfSeats = 4;
        String expectedColor = "blue";
        boolean expectedRetractableRoof = true;

        //Asset
        assertTrue("Expected Value was " + hasEngine + " but was " + car.isHasEngine(), car.isHasEngine() == true);
        assertTrue("Expected Value was " + expectedNumberOfDoors + " but was " + car.isHasEngine(), car.getNumberOfDoors() == 2);
        assertTrue("Expected Value was " + expectedNumberOfSeats + " but was " + car.isHasEngine(), car.getNumberOfSeats() == 4);
        assertTrue("Expected Value was " + expectedColor + " but was " + car.isHasEngine(), car.getColor() == "blue");
        assertTrue("Expected Value was " + expectedRetractableRoof + " but was " + car.isRetractableRoof(), car.isHasEngine() == true);
    }

    @Test
    public void testDrive(){
        //Expected Variables
        String expectedOutput = "This car is driving";

        //Expected Variables
        assertTrue("Expected Value was " + "This car is driving" + " but was " + car.drive(), car.drive() == "This car is driving");
    }

}
