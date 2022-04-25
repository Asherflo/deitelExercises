package chapterTwo;
// to determine whether a year is a leap or not

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" enter the year");
        int year = input.nextInt();
         boolean isALeap =
                 (year % 4 == 0 && year % 100 == 0) ||(year %400 == 0);
        System.out.println(year + " is a leap year" + isALeap);

    }
}
