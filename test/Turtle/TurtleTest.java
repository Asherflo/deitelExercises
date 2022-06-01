package Turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TurtleTest {
    private Turtle myTurtle;
    @BeforeEach
    public  void setUp(){
        myTurtle = new Turtle();
    }
    @Test
    public  void TurtleCanBeCreated(){

        assertNotNull(myTurtle);
    }
    @Test
    public void turtleIsPenUpTest(){
       myTurtle.isPenUp();
       assertFalse(myTurtle.isPenDown());
    }
    @Test
    public void turtlePenDown(){
        myTurtle.penDown();
        assertFalse(myTurtle.isPenDown());
    }
//    @Test
//    public void
}
