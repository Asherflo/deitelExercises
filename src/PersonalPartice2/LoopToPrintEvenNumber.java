package PersonalPartice2;

import java.util.Scanner;

public class LoopToPrintEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");

        } else
            System.out.println(number + " is an odd number");
        System.out.println();

//        A67890nother solution;
//        get the name of user
//        get his year of brith and tells if he/she can drive
//        the age must be greater than 16.


        System.out.println("Enter your your firstname and the lastname");
        String name = input.next();
        System.out.println("Enter the year you were born");
        int age = input.nextInt();
        int presentYear = 2022;
        int getAge = presentYear - age;
        if (getAge >= 16) {
            System.out.println(name + " you can drive in united state");
        } else System.out.println(name + " wait till you are 16 year");

//        Another solution
        System.out.println();
        int x = 0;
        for (int i = 0; i < 4; i++) {
            x +=1;
            System.out.println(x);
        }
//        Another Solution
        int n =10;
        while( n> 10){
            System.out.println("hello");
        }


    }
}
