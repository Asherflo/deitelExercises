package chapterTwo;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner index = new Scanner(System.in);

        System.out.println("Enter the user's weight in pound");
        double weightPounds = index.nextDouble();

        System.out.println("Enter the user's height in inches");
        double heightInches = index.nextDouble();

        double bodyMassIndex = weightPounds * 703 /(heightInches * heightInches);
        System.out.println("the body mass index calculator of this user is: " +bodyMassIndex);


    }
}
