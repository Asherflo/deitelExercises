package ChapterFive;

import org.junit.Test;

import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 50);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your prediction between 0 and 10");

        int guess = -1;
        while (guess != number) {
            System.out.println("\n enter your guess: ");
            guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("you are a genius, you won:" + number);
            } else if (guess > number) {
                System.out.println("Oops!your guess is  too high\n try again");
            } else
                System.out.println("Oops! your guess is too low\n try again");


        }
    }
}