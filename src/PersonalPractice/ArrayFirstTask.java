package PersonalPractice;

import java.util.Scanner;

public class ArrayFirstTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int [10];
        System.out.println("Enter "+array.length +" values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }




    }
}
