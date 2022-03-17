package chapterTwo;

import java.util.Scanner;

public class RealPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a five digit number:");
        int digitNumber = input.nextInt();

        int firstNumber = digitNumber / 10000;
        int secondNumber = (digitNumber % 10000) /1000;
        int thirdNumber = (digitNumber % 1000) /100;
        int fourthNumber =(digitNumber % 100) /10;
        int fifthNumber = (digitNumber % 10);

      if (firstNumber == fifthNumber) {
          if (secondNumber == fourthNumber) {
              System.out.println("it is a palindrome");
              }

          }
      }

    }

