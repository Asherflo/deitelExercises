package chapterTwo;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner saved = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer = saved.nextInt();

//        int divisibleByThree =integer % 3;
//        System.out.printf("%d",divisibleByThree);

        if(integer % 3 ==0){
            System.out.println("is it divisible by 3");
        }
        if (integer %3 != 0){
            System.out.println("is not divisible by 3");
        }
        }
    }

