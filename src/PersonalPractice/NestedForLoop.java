package PersonalPractice;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int column;
        String symbol ="@";

        System.out.println("enter the number of row: ");
        row = input.nextInt();

        System.out.println("the umber off column: ");
        column = input.nextInt();

//        System.out.println("enter the symbol: ");
//        symbol = input.next();
        for (int i = 1; i <=row; i++) {
            System.out.println();
            for (int j = 1; j <=column ; j++) {
                System.out.print(symbol);

                
            }

        }
    }


}
