package chapterFour;

public class MultiplicationTableNestedLoop {
    public static void main(String[] args) {
        System.out.printf("%35s%9s", "Multiplication" ,"Table");
        System.out.println("      ");
        for (int i = 1; i < 13 ; i++) {
            System.out.print("   " +  i);
        }
        System.out.println("\n-------------------------------------------------------------");
        for (int j = 1; j < 13; j++) {
            System.out.print(j  + "  |  ");
            for (int i = 1; i < 13; i++) {
                System.out.printf("%4d" ,j *i);
            }
            System.out.println();
        }
    }



}
