package BeforeMaven;

import java.util.Scanner;

public class MainMaybeLastAccountTrial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MaybeLastAccountTrial myAccount = new MaybeLastAccountTrial("",0.0);
        System.out.println(myAccount.getName());

        System.out.println("Enter your name: ");
        String theName = input.next();
        myAccount.setName(theName);

        System.out.println("my name is "+ myAccount.getName());
        System.out.println("enter the amount you want to deposit: ");
        double amount =input.nextDouble();
        myAccount.deposit(amount);

        System.out.println("enter the amount to withdraw ");
        double withdraw =input.nextDouble();
        myAccount.withdrawAmount(withdraw);
        System.out.println(myAccount.getBalance() + "balance");
    }
}
