package ChapterSix;

import java.util.Scanner;

import static ChapterSix.CalenderForAGivenMonth.*;

public class CalenderForAGivenMonthTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year (e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();
          printMonth(year,month);
    }
    public static void printMonth(int year, int month){
        printMonthTitle(year,month);
        printMonthBody(year,month);
    }
    public static void printMonthTitle(int year,int month){
        System.out.println("           " + getMonthName(month) +"  " + year);
        System.out.println("-------------------------------------------");
        System.out.println(" Sun Mon  Tue Wed Thurs Fri Sat ");
    }
    public static  String getMonthName(int month){
        String monthName = switch (month) {
            case 1 -> "january";
            case 2 -> "february";
            case 3 -> "march";
            case 4 -> "april";
            case 5 -> "may";
            case 6 -> "june";
            case 7 -> "july";
            case 8 -> "august";
            case 9 -> "september";
            case 10 -> "october";
            case 11 -> "november";
            case 12 -> "december";
            default -> "";
        };
        return monthName;
    }
    public  static void printMonthBody(int year, int month){
        int startDay = getStartDay(year, month);

        int numberOfDaysInMouth =getNumberOfDaysInMonth(year,month);
        int i = 0;
        for (i = 0; i < startDay;i++){
            System.out.println("  ");
        }

    }

}
