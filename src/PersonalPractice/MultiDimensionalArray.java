package PersonalPractice;

import java.util.Scanner;

public class MultiDimensionalArray {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] grades = new int[3][3];
        System.out.println("Enter " + grades.length +" rows and " +grades[0].length + "columns: ");
        for (int row = 0; row < grades.length; row++) {
            for (int column = 0; column <grades[row].length; column++) {

                System.out.print(grades[row][column]);
            }

            System.out.println();
        }


    }
}
