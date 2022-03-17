package chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){

        Scanner application = new Scanner(System.in);

        System.out.println("Enter a number");
        int firstNumber = application.nextInt();

        System.out.println(" Enter another number");
        int secondNumber = application.nextInt();

        int squareOfTheFirstNumber = firstNumber * firstNumber;
        int squareOfTheSecondNumber = secondNumber * secondNumber;

        int sumOfSquare = squareOfTheFirstNumber + squareOfTheSecondNumber;
        int differenceOfTheSquare = squareOfTheFirstNumber - squareOfTheSecondNumber;

        System.out.println ("The square Of The firstNumber is:" + squareOfTheFirstNumber );
        System.out.println ("The squareOfSecondNumber is:" + squareOfTheSecondNumber);

        System.out.println ("The sumOfSquare is:" + sumOfSquare);
        System.out.println ("The differenceOfTheSquare is: " + differenceOfTheSquare);
    }
}
