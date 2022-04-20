package PersonalPractice;

import java.security.SecureRandom;
import java.util.Scanner;

public class RollDice {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int[] input = new int[10];

        for( int counter =1 ; counter <= 10_000_000; counter++){
            ++input [1 + randomNumbers.nextInt(9)];
        }
        System.out.printf("%s%10s%n" ,"face","frequency");
        for(int face = 1;face < input.length; face++){
            System.out.printf("%4d%10d%n", face,input[face]);
        }


    }
}
