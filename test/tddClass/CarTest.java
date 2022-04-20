package tddClass;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class CarTest {
    private int year;

    @Test
    public void createNewCar() {

        Car toyota = new Car("benz", year);
        assertNotNull(toyota);
    }

    @Test
    void name() {
    }

    @Test
    public void nameOfCar() {
        Car toyota = new Car("benz", year);
        toyota.setName("benz");
         assertEquals("benz",toyota.getName());
    }
    @Test
    public void yearCarWasProduced() {
        Car toyota = new Car(year);
        toyota.yearproduced (2019);
    }


}
