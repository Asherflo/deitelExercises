package PersonalPractice;

public class ArrayEvenNumber {
    public static void main(String[] args) {
        int[] input = new int[10];

        for(int counter = 0; counter < input.length;counter++){
            input[counter] = 2+ 2* counter;
        }
        System.out.printf("%s%8s%n", " index" ,"value");

        for(int counter = 0;counter< input.length;counter++){
        System.out.printf("%5d%8d%n",counter, input[counter]);
    }
    }
}
