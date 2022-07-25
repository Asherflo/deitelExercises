package BeforeMaven;

import java.util.Scanner;

public class PrintingShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your favourite shape: ");
        int sign = input.nextInt();
        System.out.println(" enter the length of the sign provided: ");
        int shapeNumber = input.nextInt();

        int shape = sign;
        for(int i = 1; i < shapeNumber; i++) {
            System.out.println(shape);
            shape +=sign;
        }
    }

}
