package PersonalPractice;

import java.security.SecureRandom;
import java.util.Scanner;

public class ArrayNumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int[] myList = new int[4];
        int total =0;

        System.out.println("enter "+ myList.length + "values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = random.nextInt(2,9);
            System.out.print(myList[i] );
            System.out.println();
            total += myList[i];

        }
        System.out.println(total);
    }
}
