package DataStructure;

import DataStructure.DataStructureArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataStructureArrayListTest {
    private DataStructureArrayList cars;

    @BeforeEach
    private void setUp() {
        cars = new DataStructureArrayList();
    }

    @Test
    public void arrayListCanBeCreated() {
        assertNotNull(cars);
    }

    @Test
    public void addTest() {
        cars.add("volvo");
        assertEquals(1, cars.size());
    }

    @Test
    public void canAddMoreitems() {
        cars.add("toyota");
        cars.add("BNW");
        cars.add("Benza");
        cars.add("opel");
        assertEquals(4, cars.size());
    }

    @Test
    public void testCanRemove() {
        cars.add("toyota");
        cars.add("BNW");
        cars.add("Benza");
        cars.add("opel");
        cars.remove(3);
        assertEquals(3, cars.size());
    }

    @Test
    public void testToAccessAnItems() {
        cars.add("toyota");
        cars.add("BNW");
        cars.add("Benza");
        cars.add("opel");
        String result = cars.get(1);
        assertEquals("BNW", result);
    }

    @Test
    public void arrayListCanExtend() {
        cars.add("toyota");
        cars.add("BNW");
        cars.add("Benza");
        cars.add("opel");                               
        cars.add("evil_spirit");
        cars.add("evil_spirit");
        cars.add("evil_spirit");
        cars.add("evil_spirit");
        cars.add("evil_spirit");
        cars.add("evil_spirit");
        cars.add("sorry");
        cars.add("sorry");
        assertEquals(12,cars.size());

    }
    @Test
    void arrayListCanBeRemovedByIndexTest(){
        cars.add("Toyota");
        cars.add("Benz");
        cars.add("Honda");
        cars.add("Kia");
        cars.add("BMW");
        cars.remove(2);
        assertEquals(4, cars.size());
        assertEquals("Kia", cars.get(2));
            }

}




