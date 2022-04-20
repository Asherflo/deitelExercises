package ChapterSeven;

import java.util.Scanner;

public class ArrayClassExecrise {
    public static void main(String[] args) {
        int[] arrayNumbers= new int[500];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] =i +1;
        }
        for( int i = 0; i < arrayNumbers.length-1; i++){
            System.out.print( arrayNumbers[i] +",");
        }
        System.out.println(arrayNumbers[499]);

    }
}

