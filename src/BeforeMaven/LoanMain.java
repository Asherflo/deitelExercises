package BeforeMaven;

import java.util.Scanner;

public class LoanMain {
    public static void main(String[] args) {
        Loan loan = new Loan(2.5,1,1000);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter annual interest rate, for example  8.25:  ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of years as an integer: ");
        int numberOfYears= input.nextInt();

        System.out.println("Enter loan amount ,for example ,120000.95:  ");
        double loanAmount = input.nextDouble();
        System.out.printf("The loan was created on %s\n "+ "The monthly payment is %.2f\n the total payment is %.2f",loan.getLoanDate().toString(),loan.getMonthlyPayment(),loan.getTotalPayment());


    }
}
