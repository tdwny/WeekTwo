import hondaProducts.impl.Car;
import hondaProducts.impl.Motorcycle;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class LocalDealerTest {

    @Test
    public void testLocalDealer(){
        //Expected Variables
        ArrayList<Car> carInventory = new ArrayList<>();
        ArrayList<Motorcycle> motorcycleInventory = new ArrayList<>();

        //Objects
        Car car = new Car(2, 4, "blue", true);
        Motorcycle motorcycle = new Motorcycle(3, 1, "red");

        //Build Arrays
        carInventory.add(car);
        motorcycleInventory.add(motorcycle);

        //Asset Car
        assertTrue("Expected Value was " + 1 + " but was " + carInventory.size(), carInventory.size() == 1);
        assertTrue("Expected Value was " + 1 + " but was " + motorcycleInventory.size(), motorcycleInventory.size() == 1);
    }

}
