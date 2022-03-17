package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    @Test
    public void powerOn() {
        //given
        Television samsung = new Television();
        assertFalse(samsung.isOn());
//when
        samsung.setOnOrOff();
//assert
        assertTrue(samsung.isOn());
    }

    @Test
    public void powerOffTest() {
        Television samsung = new Television();
        samsung.setOnOrOff();
        assertTrue(samsung.isOn());

        samsung.setOnOrOff();// to turn off again

        assertFalse(samsung.isOn());
    }

    @Test
    public void startChannel() {
        Television samsung = new Television();
        samsung.setOnOrOff();
        assertTrue(samsung.isOn());

        samsung.setChannel(20);
        assertEquals(20, samsung.getChannel());
    }
    @Test
    public void increaseChannel(){
        Television samsung = new Television();
        samsung.setOnOrOff();
        assertTrue(samsung.isOn());

        samsung.setChannel(100);
        samsung.increaseChannel();
        samsung.increaseChannel();
        samsung.increaseChannel();
        samsung.increaseChannel();
        assertEquals(100,samsung.getChannel());

    }
    @Test
    public void decreaseChannel(){
        Television samsung = new Television();
        samsung.setOnOrOff();
        assertTrue(samsung.isOn());

        samsung.setChannel(100);
        samsung.decreaseChannel();
        samsung.decreaseChannel();

        assertEquals(98,samsung.getChannel());
    }
    @Test
    public void increaseVolume(){
        Television samsung = new Television();
        samsung.setOnOrOff();
        assertTrue(samsung.isOn());

        samsung.increaseVolume();
        samsung.increaseVolume();


        assertEquals(2,samsung.getVolume());
    }
    @Test
    public void decreaseVolume(){
        Television samsung = new Television();
        samsung.setOnOrOff();
        assertTrue(samsung.isOn());

        samsung.increaseVolume();
        samsung.increaseVolume();
        samsung.increaseVolume();
        samsung.increaseVolume();
        samsung.decreaseVolume();
        samsung.decreaseVolume();
        assertEquals(2,samsung.getVolume());
    }
}