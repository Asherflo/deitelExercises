package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {
    @Test
    public void turnOnTest(){
        AirConditioner LG = new AirConditioner();
        LG.setOn(true);
        assertTrue(LG.isOn());
//        assertEquals(true,LG.isOn());
    }

    @Test
    public void turnOff(){
        AirConditioner LG = new AirConditioner();
        LG.setOn(false);
        assertEquals(false,LG.isOn());

    }
  @Test
    public void toIncreaseTemperature(){
        AirConditioner LG = new AirConditioner();
        LG.increaseTemperature(16);
        assertEquals(17,LG.increaseTemperature());

    }
    @Test
    public void toDecreaseTemperature(){
        AirConditioner LG = new AirConditioner();
        LG.decreaseTemperature(23);
        assertEquals(16,LG.decreaseTemperature());
    }



}
