package ChapterSeven;

import java.util.Scanner;

public class ArrayInitializer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] myList =new double[9];

        System.out.println("Enter "+ myList.length + "values: ");
        for (int i =0; i < myList.length;i++)
            myList[i]=input.nextDouble();
    }
}
