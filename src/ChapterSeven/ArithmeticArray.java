package ChapterSeven;

import java.security.SecureRandom;
import java. util.Random;

public class ArithmeticArray {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int[] input = new int[10];
        int total = 0;
        int maximumNumber = 0;
        int averageOfTheArray = 0;

        for (int counter = 1; counter < input.length; counter++) {
            input[counter] = randomNumber.nextInt(100);
        }
        for (int counter = 1; counter < input.length; counter++) {
            System.out.print(input[counter] + " ");

        }
        for (int counter = 1; counter < input.length; counter++) {
            if (input[counter] > maximumNumber) {
                maximumNumber = input[counter];
            }
        }
        System.out.println();
        System.out.print("the maximum number is: " + maximumNumber);

        for (int counter = 1; counter < input.length; counter++) {
            total += input[counter];
        }
            System.out.println();
            System.out.println("the total array is: " +total);

        for ( int counter = 1; counter < input.length; counter++){
            averageOfTheArray = total /input.length;
        }
        System.out.println();
        System.out.println("the average of the array: " + averageOfTheArray);
    }
}

