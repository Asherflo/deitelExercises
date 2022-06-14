package BeforeMaven;

import java.util.Scanner;

public class ClockMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Clock clock = new Clock(0,0,0);
        System.out.println("*** you are welcome to this  display time app ***");
        System.out.println();

        System.out.println("enter the hour: ");
        int hour = input.nextInt();
        System.out.println("enter the minutes: ");
        int minutes = input.nextInt();
        System.out.println("enter the seconds: ");
        int seconds = input.nextInt();


        clock.setHour(hour);
        clock.setMinute(minutes);
        clock.setSeconds(seconds);

        System.out.println("*** display time App in hh:ss:mm ***  " +clock.getHour() + ":" + clock.getMinutes() + ":" + clock.getSeconds());

    }
}
