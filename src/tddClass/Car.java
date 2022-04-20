package tddClass;

public class Car {
    private String name;
    private int year;


public Car(String name, int year){
    this.name = name;
    this.year = year;
}

    public Car(int year) {
        this.year = year;
//        this.name = name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
    return name;
    }

    public void yearproduced(int year) {
    year =2019;
    }
}


