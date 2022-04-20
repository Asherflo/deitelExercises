package ChapterFive;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.print(
                "what is  " + number1 + "+" + number2 +"?");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            System.out.println("wrong answer.try again.what is " + number1 +" +" + number2 + "?");
            answer = input.nextInt();
        }
        System.out.println("you got it");
    }
}
