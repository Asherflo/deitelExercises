package PersonalPractice;

import java.io.OptionalDataException;

public class ArrayDeclaration {
    public static void main(String[] args) {
        int[] x ={23,26,56,12,31,56,9,32,24,10,0};
        System.out.printf("%s%8s%n", "Index", "Value");
        // output each array element's value

        for(int counter = 0; counter < x.length; counter++){
            System.out.printf("%5d%8d%n",counter,x[counter]);
        }
    }
}
