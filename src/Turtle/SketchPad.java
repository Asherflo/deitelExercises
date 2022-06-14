package Turtle;


public class SketchPad {
    private int[][] floor;

    public SketchPad(int floorRow, int floorColumn) {
        floor = new int[floorRow][floorColumn];
    }
    public int[][] getFloor() {
        return floor;
    }

    @Override
    public String toString() {
       StringBuilder toBeReturned = new StringBuilder();
        for (var column : floor) {
            for (var row : column) {
                if (row == 0) toBeReturned.append("  ");
                if (row == 1) toBeReturned.append("* ");
            }
            toBeReturned.append("\n");
        }
        return toBeReturned.toString();
    }
}
