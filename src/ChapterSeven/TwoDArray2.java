package ChapterSeven;

public class TwoDArray2 {
    public static void main(String[] args) {
        int [][] array1 ={{1,2,3},{4,5,6}};
        int [][] array2 = {{ 1,2},{3},{4,5,6}};
        System.out.println("Values  in array1 by row are ");
        outputArray(array1);
        System.out.println("Values  in array2 by row are ");
        outputArray(array2);

    }

    private static void outputArray(int[][] array) {
        for (int[] ints : array) {
            for (int column = 0; column < ints.length; column++) {
                System.out.print(ints[column] + " ");
            }
            System.out.println();
        }
    }
}
