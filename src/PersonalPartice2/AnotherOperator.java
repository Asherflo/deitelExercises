package PersonalPartice2;

import java.util.Scanner;

public class AnotherOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 17;
        if(age >= 21){
            System.out.println("you can drive and yoou can buy an alcoholic drink");
        }
        else if( age >= 16){
            System.out.println("you can drive too");
        }
        else{
            System.out.println("wait for your turn");
        }
        int points =10;

        String result =(points >= 10)?"winner":"loser";
        System.out.println(result);

        System.out.println();

//  A string while loop
        System.out.println("Enter a Word: ");
        String s;
        while (true){
            s = input.next();
            if(s.equals("hello")){
                System.out.println("correct");
                break;
            } else{
                System.out.println("Try again!");
                continue;
            }
        }
    }
}
