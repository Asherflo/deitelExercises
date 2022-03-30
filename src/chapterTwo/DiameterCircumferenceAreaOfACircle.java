package chapterTwo;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;


public class DiameterCircumferenceAreaOfACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of radius: ");
        int radius = input.nextInt();

        int diameterOfACircle  = 2* radius;
        System.out.printf("%d%n" ,diameterOfACircle);

        double circumferenceOfACircle = (2*Math.PI)*radius;
        System.out.printf("%f%n",circumferenceOfACircle);

        double areaOfACircle =Math.PI*(radius* radius);
        System.out.printf( "%f%n", areaOfACircle);

    }
}
