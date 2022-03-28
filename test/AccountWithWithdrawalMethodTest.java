import chapterThree.AccountWithWithdrawalMethod;

import java.util.Scanner;

public class AccountWithWithdrawalMethodTest {
    public static void main(String[] args) {
        AccountWithWithdrawalMethod account1 =new AccountWithWithdrawalMethod("asher",50.00);
        AccountWithWithdrawalMethod account2 = new AccountWithWithdrawalMethod("abike",34.50);

        System.out.printf("%s balance:$%.2f%n",
        account1.getName(),account1.getBalance());

        System.out.printf("%s balance:$%.2f%n",
                account2.getName(),account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.println("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.println("Enter deposit amount for account2: ");
         depositAmount = input.nextDouble();


        System.out.println("print out the balance"+ depositAmount);
        account1.deposit(depositAmount);
        System.out.println("print out the balance"+ depositAmount);
        account2.deposit(depositAmount);

        System.out.println();
        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());


        System.out.println("Enter withdrawal amount for account1: ");
        double withdrawAccount = input.nextDouble();
        account1.withdrawal(withdrawAccount);
        System.out.println("Enter withdrawal amount for account1: ");
        withdrawAccount = input.nextDouble();
        account2.withdrawal(withdrawAccount);

        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());


    }
}