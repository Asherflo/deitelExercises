package ChapterFive;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the initial number");
        int value = input.nextInt();

        for (int count = 1; count <= 12; count++) {
            int twice =count* value;

            //System.out.printf(count + "x" + value + " = " +twice);
            System.out.printf("%d X %d = %d\n",value,count,twice);

        }
    }
}
