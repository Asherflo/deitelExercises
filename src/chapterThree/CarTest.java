package chapterThree;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car myNewCar = new Car("","",0);
        Car myNewCar2 = new Car("","",0);

        myNewCar.setModel("venza");
        myNewCar.getModel();
        System.out.println("The model of this toyota car is " + myNewCar.getModel());

        myNewCar.setYear("2020");
        System.out.println("Toyota "+myNewCar.getModel() + " was produced in year "+myNewCar.getYear());

//        myNewCar.setPrice(-2);
//        System.out.println("THe price of this car was "+ myNewCar.getPrice());

    }
}
