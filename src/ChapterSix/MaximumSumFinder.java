package ChapterSix;

import java.util.Scanner;

public class MaximumSumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three floating- point  values seperated by spaces:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);
        System.out.println("the maximum number is: " + result);

        double anotherResult = sum(number1, number2, number3);
        System.out.println("the sum total is: " + anotherResult);


    }

    private static double sum(double number1, double number2, double number3) {
        double total = 0;
        total = number1 + number2 + number3;
        return total;
    }


    public static double maximum(double number1, double number2, double number3) {
        double maximumValue = number1;
        if (number2 > maximumValue) {
            maximumValue = number2;
        }
        if (number3 > maximumValue) {
            maximumValue = number3;
        }
        return maximumValue;


    }


}