package ChapterFive;

import java.util.Scanner;

public class StudentGrade {


    public static void main(String[] args) {

        Scanner asherFlo = new Scanner(System.in);


        int Agrade = 0;
        int Bgrade = 0;
        int Cgrade = 0;
        int Dgrade = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter your name: ");
            asherFlo.next();


            System.out.println("Enter Your Grade ");
            String Grade = asherFlo.next();


            switch (Grade) {
                case "A" -> Agrade++;
                case "B" -> Bgrade++;
                case "C" -> Cgrade++;
                case "D" -> Dgrade++;
                default -> System.out.println("only input grade A-D");
            }
        }
                System.out.println(Agrade + "grade A");
                System.out.println(Bgrade + "grade B");
                System.out.println(Cgrade + "grade C");
                System.out.println(Dgrade + "grade D");




    }
}

