package DataStructure;

import DataStructure.Set;

import java.io.OptionalDataException;

public class DataStructureArrayList {
    private int extended = 2;
    private int counter = 0;
    private final int initialNumber = 5;
    private String[] cars = new String[initialNumber];


//    public static boolean toString(Set sets) {
////        return String.toString;
//    }


    public void add(String name) {
        if(counter == (initialNumber * (extended -1)))extend();
        cars[counter] = name;
        counter++;

    }

    public int size() {
        return counter;
    }

    public void remove(String name) {
        cars[counter] = name;
        counter--;
    }

    public String get(int index) {
        return cars[index];

    }
    private void extend(){
        int temporaryNumber = initialNumber *extended;
        String[] newCars = new String[temporaryNumber];
        System.arraycopy(cars, 0, newCars, 0, cars.length);
        cars = newCars;
        extended++;
    }

    public void remove (int index){
        for (int i = cars.length - 1; i <= 0; i--) {
            cars[i] = cars[index];
            cars[index] = cars[i + 1];

        }
        canRemove(index);
        counter--;
    }
    private void canRemove(int index){
        cars[index] = null;
        for (int i = 0; i < cars.length-1; i++) {
            if (cars[i] == null){
                cars[i] = cars[i+1];
                cars[i+1] = cars[index];
            }
        }
    }
}






