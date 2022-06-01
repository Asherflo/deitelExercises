package chapterFour;

import java.util.Scanner;

public class ClassAverageExample {
    public static void main(String[] args) {
        Scanner Florence = new Scanner(System.in);
        int totalGrade = 0;
        int gradeCounter = 1;

        while (gradeCounter <=10) {
            System.out.println("Enter grade: ");
            int grade = Florence.nextInt();
            totalGrade = totalGrade + grade;
            gradeCounter =gradeCounter +1;
        }
        int average =totalGrade /10;
        System.out.println("total of all 10 grade is:" + totalGrade);
        System.out.println("class average is: " + average);
    }
}
