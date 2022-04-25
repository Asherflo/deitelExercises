package PersonalPractice;

import java.util.Scanner;

public class CountingMonetaryUnit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount ");
        double amount = input.nextDouble();
        System.out.println("The initial amount is: "+ amount);

        int cents = (int)(amount* 100);


         int numberOfDollars = cents /100;
         cents = cents % 100;

         int numberOfQuarter = cents / 25;
         cents = cents % 25;

         int numberOfDimes = cents/ 10;
         cents = cents % 10;

         int  numberOfNickels = cents /5;
         cents = cents % 5;

         int numberOfPennies = cents ;

        System.out.println("your amount "+ amount+" consist of ");
        System.out.println("    " +  numberOfDollars + "Dollars");
        System.out.println("    "+ numberOfQuarter + "quarters");
        System.out.println("    "+ numberOfDimes + "Dimes");
        System.out.println("    "+ numberOfNickels + "Nickels");
        System.out.println("    "+ numberOfPennies + "pennies");





    }

}
