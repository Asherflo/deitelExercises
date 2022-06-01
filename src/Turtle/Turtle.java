package Turtle;

public class Turtle {
    private Pen biro= new Pen();
    private boolean isDown = false;


    public boolean isPenUp() {
        return true;
    }

    public boolean isPenDown() {
        return isDown;
    }

    public void penDown() {
        biro.penDown();
    }
}
