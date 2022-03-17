package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void turnOn() {
        AutomaticBike honda = new AutomaticBike();
        honda.setOnOrOff();
        honda.setOnOrOff();
        honda.setOnOrOff();
        honda.setOnOrOff();
        honda.setOnOrOff();
        assertTrue(honda.isOn());
    }

    @Test
    public void accelerateAtGearOne() {
        AutomaticBike honda = new AutomaticBike();
        honda.setSpeed(15);
        honda.accelerate();
//        honda.accelerate();
//        honda.accelerate();
        assertEquals(16, honda.getSpeed());
    }

    @Test
    public void accelerateAtGearTwo() {
        AutomaticBike honda = new AutomaticBike();
        honda.setSpeed(24);
        honda.accelerate();
//        honda.accelerate();
        assertEquals(26, honda.getSpeed());

    }

    @Test
    public void accelerateAtGearThree() {
        AutomaticBike honda = new AutomaticBike();
        honda.setSpeed(35);
        honda.accelerate();
//        honda.accelerate();
//        honda.accelerate();
        assertEquals(38, honda.getSpeed());

    }

    @Test
    public void deaccelerateAtOne() {
        AutomaticBike honda = new AutomaticBike();
        honda.setSpeed(15);
        honda.deccelerate();
        assertEquals(14, honda.getSpeed());

    }
    @Test
    public void deaccelerateAtTwo(){
        AutomaticBike honda = new AutomaticBike();
        honda.setSpeed(24);
        honda.deccelerate();
        assertEquals(22,honda.getSpeed());

    }
    @Test
    public void deccelerateAtThree(){
        AutomaticBike honda = new AutomaticBike();
        honda.setSpeed(35);
        honda.deccelerate();
        assertEquals(32,honda.getSpeed());

    }
    @Test
    public void deccelerateAtFour(){
        AutomaticBike honda =new AutomaticBike();
        honda.setSpeed(44);
        honda.deccelerate();
        assertEquals(40,honda.getSpeed());

    }
}









