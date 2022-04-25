package PersonalPractice;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class SaturdayDose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number1 =random.nextInt(1,9);
        int number2 =random.nextInt(3,8);
//to add and display two random generated additions  and also to display if the statement is True or false;

        System.out.print("what is " +  number1 + " + " + number2 + " ?");
        int answer = input.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + answer );
        System.out.println(number1 + number2 == answer);



// to print out secured random numbers generated from a origin to a bound
//        System.out.println("random number for number1 are :  "+number1);
//
//        SecureRandom object = new SecureRandom();
//        int number = object.nextInt(23,36);
//        System.out.println("print secure random number"+ number);

    }

}
