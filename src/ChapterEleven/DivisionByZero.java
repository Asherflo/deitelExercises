package ChapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        int  numerator =input("Enter numerator");
        int denominator =input("Enter denominator");
        int approximateQuotient= numerator /denominator;
        display(approximateQuotient+"");
    }

    private static int input(String prompts) {
        display(prompts);
        Scanner keyboardInput = new Scanner(System.in) ;
        int number = 0;
        try{
            return keyboardInput.nextInt();
        }
        catch(InputMismatchException ex){
            display("i expect only int");
            display("follow instruction");
            input(prompts);
        }
        return keyboardInput.nextInt();
    }
//    return number


    private  static void display(String prompts) {
        System.out.println(prompts);
    }
}
