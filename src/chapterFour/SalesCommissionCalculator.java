package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;
        System.out.println("enter the items sold 1 ,2,3,4");
        int items = input.nextInt();
        while (items != -1) {
            if (items == 1) {
                total = total + 239.99;
            }
            if (items == 2) {
                total = total + 129.75;
            }
            if (items == 3) {
                total = total + 99.95;
            }
            if (items == 4) {
                total = total + 350.39;
            }
            System.out.println("enter items sold");
            items = input.nextInt();

            double earnings = (0.09 * total) + 200;
            System.out.println("" + earnings);


        }
    }
}
