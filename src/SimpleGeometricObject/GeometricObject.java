package SimpleGeometricObject;

import java.util.Date;

public class GeometricObject {
    private  String color = "white";
    private boolean filled;
    private java.util.Date dataCreated;

    public GeometricObject(String color, boolean filled) {
        dataCreated = new java.util.Date();
        this.filled = filled;
        this.color = color;

    }


    public  String getColor() {
        return color;
    }

    public  void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDataCreated() {
        return dataCreated;
    }
    public String toString() {
        return "created on" + dataCreated +"\ncolor:  "+ color + "and filled: " +filled;
    }


}
