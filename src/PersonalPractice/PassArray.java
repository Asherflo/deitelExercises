package PersonalPractice;

import ChapterFive.ForExercises;

import java.util.Arrays;
import java.util.Scanner;

public class PassArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myIntArray = new int[4];
        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 2;
            myIntArray[i] = input.nextInt();
        }

            System.out.println(Arrays.toString(myIntArray));

//
////
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + ", value is" + array[i]);
//
////        }


//
//        for(int i: myIntArray){
//            System.out.print(i + " , ");
//        }
//    }
    }
}
