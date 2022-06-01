package ChapterSix;

import java.util.Scanner;

public class CalenderForAGivenMonth {
//    write a program that display the calendar for a given month of the year.
//    the program prompts the user to enter the year and the mouth,
//    then displays the entire calendar for the month.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the year (e.g., 2012): ");
    int year = input.nextInt();

    System.out.print("Enter month as a number between 1 and 12: ");
    int month = input.nextInt();
    printMonth(year,month);
}
    public static void printMonth(int year, int month) {
        System.out.print( month +" " + year);
    }
    public static void printMonthTitle(int year,int month){
    }
    public static void printMonthBody(int year,int month){
    }
    public static  String getMonthName(int Month){
    return "january";
    }
    public static int getStartDay(int year,int month){
    return 1;
    }
    public static int getTotalNumberOfDays(int year,int month){
    return 1000;
    }
    public static int getNumberOfDaysInMonth(int year,int month){
    return 31;
    }
    public static boolean isALeapYear(int year){
    return true;
}
}
