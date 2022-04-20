package chapterFour;

import java.util.Scanner;

public class MainHighestCommonFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the first number: ");
        int secondNumber = input.nextInt();

        int HCF = 1;
        int possibleHCF = 2;
        while (possibleHCF <= firstNumber && possibleHCF <= secondNumber) {
            if(firstNumber % possibleHCF ==0 && secondNumber %possibleHCF == 0)
                HCF = possibleHCF;
            possibleHCF++;
        }
        System.out.println("The highest common factor for " +  firstNumber + "  and  " + secondNumber +"  is  " +HCF);
    }
}