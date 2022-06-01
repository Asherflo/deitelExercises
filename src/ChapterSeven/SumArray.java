package ChapterSeven;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] numbers = new int[2][3];
        System.out.println("enter " + numbers.length + " rows  and " + numbers[0].length + " columns: ");
        int total = 0;

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                numbers[row][column] = input.nextInt();
            }
        }

        for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    total += numbers[i][j];
                    System.out.print(numbers[i][j] + " ");
                }
            System.out.println();
        }

                System.out.println("the total array is: " + total);


            }
        }







