package PersonalPractice;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time in seconds: ");
        int seconds = input.nextInt();

        int minutes =seconds / 60;
        int remainingSecond = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes + " and " +remainingSecond +" seconds");
    }

}
