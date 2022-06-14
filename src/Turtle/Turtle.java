package Turtle;



import static Turtle.Direction.*;

public class Turtle {
    private Pen biro= new Pen();
    private boolean isDown = true;
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);


    public boolean isPenUp() {
        return true;
    }

    public boolean isPenDown() {
        return biro.isDown();
    }

    public void penDown() {
        biro.penDown();
    }


    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == EAST) {currentDirection = SOUTH;
        }else if(currentDirection == SOUTH) {
            currentDirection = WEST;
        }else if (currentDirection == WEST) {currentDirection = NORTH;}
        else if(currentDirection == NORTH) {currentDirection = EAST;}

    }

    public void turnLeft() {
        if(currentDirection ==EAST){currentDirection = NORTH;}
        else if(currentDirection ==NORTH){currentDirection = WEST;
        } else if (currentDirection == WEST) {
            currentDirection = SOUTH;

        }else  if (currentDirection == SOUTH) {currentDirection =EAST;}

    }

    public void move(int numberOfStep, SketchPad sketchPad) {
        if(isPenDown()) writeOnSketchPad(numberOfStep, sketchPad);
        moveWithoutWriting(numberOfStep);
    }

    private void writeOnSketchPad(int numberOfStep, SketchPad sketchPad) {
        if (currentDirection == EAST) writeOnColumnForward(numberOfStep, sketchPad);
        if(currentDirection == SOUTH) writeOnRowForward(numberOfStep, sketchPad);
        if(currentDirection == WEST) writeOnColumnBackward(numberOfStep, sketchPad);
        if(currentDirection == NORTH) writeOnRowBackward(numberOfStep, sketchPad);
    }

    private void writeOnRowBackward(int numberOfStep, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        int counter = row;
        for (int i = row; i < row + numberOfStep; i++) {
            floor[counter][column] = 1;
            counter--;
        }
    }

    private void writeOnColumnBackward(int numberOfStep, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        int counter = column;
        for (int i = column; i < column + numberOfStep; i++) {
            floor[row][counter] = 1;
            counter--;
        }
    }

    private void writeOnRowForward(int numberOfStep, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        for (int i = row; i < row + numberOfStep; i++) {
            floor[i][column] = 1;
        }

    }

    private void writeOnColumnForward(int numberOfStep, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        for (int i = column; i < column + numberOfStep; i++) {
            floor[row][i] = 1;
        }
    }

    private void moveWithoutWriting(int numberOfStep) {
        if (currentDirection == EAST) increaseColumnBy(numberOfStep);
        if(currentDirection == SOUTH) increaseRowBy(numberOfStep);
        if(currentDirection == WEST) decreaseByColumn(numberOfStep);
        if(currentDirection == NORTH) decreaseByRow(numberOfStep);
    }

    private void decreaseByRow(int numberOfStep) {
        int currentRowPosition  = currentPosition.getRow();
        currentPosition.setRow(currentRowPosition - numberOfStep + 1);
    }

    private void decreaseByColumn(int numberOfStep) {
        int currentColumnPosition  = currentPosition.getColumn();
        currentPosition.setColumn(currentColumnPosition - numberOfStep + 1);
    }




    private void increaseRowBy(int numberOfStep) {
        int currentRowPosition = currentPosition.getRow();
        currentPosition.setRow(currentRowPosition + numberOfStep  - 1);
    }

    private void increaseColumnBy(int numberOfStep) {
        int currentColumnPosition  = currentPosition.getColumn();
        currentPosition.setColumn(currentColumnPosition+ numberOfStep - 1);
        
    }

    public Position getCurrentPosition() {
        return currentPosition;

    }
}
