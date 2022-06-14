package Turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
;
import static Turtle.Direction.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TurtleTest {
    private Turtle myTurtle;
    private  SketchPad sketchPad;
    @BeforeEach
    public  void setUp(){

        myTurtle = new Turtle();
        sketchPad = new SketchPad(5,5);
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
        assertTrue(myTurtle.isPenDown());
    }

    @Test
    public void movePenDownTest(){
        assertFalse(myTurtle.isPenDown());
        myTurtle.penDown();
        assertTrue(myTurtle.isPenDown());
    }
    @Test
    public void positionIsEastByDefaultTest(){
        assertSame(EAST,myTurtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveRightFromEastToSouthTest(){
        assertSame(EAST,myTurtle.getCurrentDirection());
        myTurtle.turnRight();
        assertSame(SOUTH,myTurtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveFromSouthToWestTest() {
        assertSame(EAST,myTurtle.getCurrentDirection());
        myTurtle.turnRight();
        myTurtle.turnRight();
        assertSame(WEST,myTurtle.getCurrentDirection());
    }
     @Test
    public void turtleCanMoveFromWestToNorth(){
        assertSame(EAST,myTurtle.getCurrentDirection());
         myTurtle.turnRight();
         myTurtle.turnRight();
         myTurtle.turnRight();
         assertSame(NORTH,myTurtle.getCurrentDirection());
     }

     @Test
    public void turtleCanMoveFromNorthBackToEast(){
        assertSame(EAST,myTurtle.getCurrentDirection());
        myTurtle.turnRight();
        myTurtle.turnRight();
        myTurtle.turnRight();
        myTurtle.turnRight();
        assertSame(EAST,myTurtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveFromEastToNorth(){
        assertSame(EAST,myTurtle.getCurrentDirection());
        myTurtle.turnLeft();
        assertSame(NORTH,myTurtle.getCurrentDirection());
    }
    @Test
    public void turtleCanMoveFromNorthToWest(){
        assertSame(EAST,myTurtle.getCurrentDirection());
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        assertSame(WEST,myTurtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveFromWestToSouth(){
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        assertSame(SOUTH,myTurtle.getCurrentDirection());
    }

    @Test
    public  void turtleCanMoveFromSouthToEast(){
        assertSame(EAST,myTurtle.getCurrentDirection());
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        myTurtle.turnLeft();
        assertSame(EAST,myTurtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardFacingEast(){

        myTurtle.move(3, sketchPad);
        assertEquals(new Position(0,2),myTurtle.getCurrentPosition());
        myTurtle.move(3,sketchPad);
        assertEquals(new Position(0,4),myTurtle.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveForwardFacingSouth() {

        myTurtle.turnRight();
        myTurtle.move(2, sketchPad);
        assertEquals(new Position(1, 0), myTurtle.getCurrentPosition());
        myTurtle.move(2, sketchPad);
        assertEquals(new Position(2, 0), myTurtle.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveFromForwardWest(){
        myTurtle.move(5, sketchPad);
        assertEquals(new Position(0,4),myTurtle.getCurrentPosition());
        myTurtle.turnRight();
        myTurtle.turnRight();
        myTurtle.move(3, sketchPad);
        assertEquals(new Position(0, 2), myTurtle.getCurrentPosition());

    }
    @Test
    public void turtleCanMoveFrowardNorth(){
        myTurtle.turnRight();
        myTurtle.move(5, sketchPad);
        assertEquals(new Position( 4,0), myTurtle.getCurrentPosition());
        myTurtle.turnRight();
        myTurtle.turnRight();
        myTurtle.move(3, sketchPad);
        assertEquals(new Position( 2,0), myTurtle.getCurrentPosition());
    }
    @Test
    public void whenPenDown_turtleWriteFacingEast(){
        myTurtle.penDown();
        myTurtle.move(5, sketchPad);
        String expected = "* * * * * \n          \n          \n          \n          \n";
        assertEquals(expected, sketchPad.toString());
        assertEquals(new Position(0,4), myTurtle.getCurrentPosition());
    }
    @Test
    public void whenPenDown_turtleWriteFacingSouth(){
        myTurtle.turnRight();
        myTurtle.penDown();
        myTurtle.move(5, sketchPad);
        String expected = "*         \n*         \n*         \n*         \n*         \n";
        assertEquals(expected, sketchPad.toString());
        assertEquals(new Position(4,0), myTurtle.getCurrentPosition());
    }

    @Test
    public void whenPenDown_turtleWriteFacingWest(){
        myTurtle.move(5,sketchPad);
        myTurtle.turnRight();
        myTurtle.turnRight();
        myTurtle.penDown();
        myTurtle.move(5, sketchPad);
        String expected = "* * * * * \n          \n          \n          \n          \n";
        assertEquals(expected, sketchPad.toString());
        assertEquals(new Position(0,0), myTurtle.getCurrentPosition());
    }
    @Test
    public void whenPenDown_turtleWriteFacingNorth(){
        myTurtle.turnRight();
        myTurtle.move(5, sketchPad);
        myTurtle.turnRight();
        myTurtle.turnRight();
        myTurtle.penDown();
        myTurtle.move(5, sketchPad);
        String expected = "*         \n*         \n*         \n*         \n*         \n";
        assertEquals(expected, sketchPad.toString());
        assertEquals(new Position(0,0), myTurtle.getCurrentPosition());
    }
    @Test
    public void whenPenDown_turtleWriteFigureTwo(){
        myTurtle.move(2, sketchPad);
        myTurtle.penDown();
        myTurtle.move(3, sketchPad);
        myTurtle.turnRight();
        myTurtle.move(3, sketchPad);
        myTurtle.turnRight();
        myTurtle.move(3, sketchPad);
        myTurtle.turnLeft();
        myTurtle.move(3, sketchPad);
        myTurtle.turnLeft();
        myTurtle.move(3, sketchPad);
        System.out.println(sketchPad.toString());
        assertEquals(new Position(4,3), myTurtle.getCurrentPosition());
    }





}
