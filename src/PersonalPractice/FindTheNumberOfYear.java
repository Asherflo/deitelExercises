package PersonalPractice;

import java.util.Scanner;

public class FindTheNumberOfYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the minutes :");
        int minutes = input.nextInt();

        int daysInYears = 365;
        int hoursInDays = 24;
        int minutesInDays = 60;


        int year =minutes /(daysInYears * hoursInDays * minutesInDays);
        int days = minutes % (daysInYears * hoursInDays * minutesInDays) /(minutesInDays* hoursInDays);
        System.out.println(minutes + "minutes is approximately "+ year +"years" + days + "days");
    }
}
