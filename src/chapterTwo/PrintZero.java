package chapterTwo;

import java.util.Scanner;

public class PrintZero {
    public static void main(String[] args) {
        Scanner semicolon = new Scanner(System.in);

        System.out.println("enter a number");
        int number1 = semicolon.nextInt();


        if(number1 == 0){
            System.out.println("1");
        }
        if(number1 == 1){
            System.out.println("0");
        }

    }
}
