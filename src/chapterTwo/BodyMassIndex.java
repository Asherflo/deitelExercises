package chapterTwo;

import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        System.out.println("Enter your height in inches");
        double heightInches = scanner.nextDouble();

        double bodyMassIndex = (weightInPounds *703)/(heightInches * heightInches);
        System.out.println("the Body Mass index of the user is: ");

        if(bodyMassIndex < 18.5){
            System.out.println("underweight");
        }
        else if (bodyMassIndex < 25.0){
            System.out.println("Normal");
        }
        else if (bodyMassIndex < 30.0){
            System.out.println("overweight");
        }
        else
            System.out.println("obese");

    }
}
