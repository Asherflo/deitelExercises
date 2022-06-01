package ChapterSeven;

import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][2];
        int total = 0;

        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }

        }
        for (int[] ints : matrix) {
            for (int column = 0; column < ints.length; column++) {
                total += ints[column];
                System.out.print(ints[column] + " ");
            }
            System.out.println();
        }
        System.out.print(total);

        }
    }
