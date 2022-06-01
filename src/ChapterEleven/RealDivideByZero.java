package ChapterEleven;

import java.util.Scanner;

public class RealDivideByZero {
    public  static int quotient(int numerator, int denominator) {
        if(denominator == 0)
            throw new ArithmeticException("Divisor cannot be zero");
        return  numerator / denominator;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;

        System.out.println("please enter an  integer numerator:  ");
        int numerator = input.nextInt();
        System.out.println("please enter an integer denominator: ");
        int denominator = input.nextInt();

            try {
                int result = quotient(numerator, denominator);
                System.out.println(result);
                continueLoop = false;
            } catch (ArithmeticException e) {
                System.out.println("cannot divide by zero");
            }

        System.out.println("execution continues...");

    }

}
