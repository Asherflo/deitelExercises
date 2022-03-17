package chapterTwo;

import java.util.Scanner;
public class Temperature{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in celsius");
        double celsius = input.nextDouble();

        double fahrenhenti = (9.0/5)* celsius + 32;
        System.out.println("your temperature in fahrenheti is:" + fahrenhenti);

    }
}