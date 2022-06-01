package PatternDesignPractice;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int  num = input.nextInt();
        char value ='A';
        int space = num;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            for (int k = 1; k <= i; k++) {
                System.out.print(value +" ");
                if( value == 'Z'){
                    value ='A';
                    continue;
                }
                value++;
            }
            space--;
                System.out.println();
            }
        }
    }
}
