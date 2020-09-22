import hondaProducts.impl.Car;
import hondaProducts.impl.Motorcycle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MotorcycleTest {

    //LocalVariables
    Motorcycle motorcycle;

    @Before
    public void initialize(){
        //Object
        motorcycle = new Motorcycle(3, 1, "red");
    }

    @Test
    public void testMotorcycle(){
        //Expected Variables
        boolean hasEngine = true;
        int numberOfWheels = 3;
        int numberOfSeats = 1;
        String color = "red";

        //Asset
        assertTrue("Expected Value was " + hasEngine + " but was " + motorcycle.isHasEngine(), motorcycle.isHasEngine() == true);
        assertTrue("Expected Value was " + numberOfWheels + " but was " + motorcycle.getNumberOfWheels(), motorcycle.getNumberOfWheels() == 3);
        assertTrue("Expected Value was " + numberOfSeats + " but was " + motorcycle.getNumberOfSeats(), motorcycle.getNumberOfSeats() == 1);
        assertTrue("Expected Value was " + color + " but was " + motorcycle.getColor(), motorcycle.getColor() == "red");
    }

    @Test
    public void testRide(){
        //Expected Variables
        String expectedOutput = "This motorcycle is being ridden";

        //Expected Variables
        assertTrue("Expected Value was " + "This motorcycle is being ridden" + " but was " + motorcycle.ride(), motorcycle.ride() == "This motorcycle is being ridden");
    }

    @Test
    public void testWeelie(){
        //Expected Variables
        String expectedOutput = "Rider is popping a wheelie";

        //Expected Variables
        assertTrue("Expected Value was " + "Rider is popping a wheelie" + " but was " + motorcycle.wheelie(), motorcycle.wheelie() == "Rider is popping a wheelie");
    }

}
