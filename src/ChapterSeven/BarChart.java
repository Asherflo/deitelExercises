package ChapterSeven;

public class BarChart {
    public static void main(String[] args) {
        int[] array = {0 ,0, 0,1,0,0,1,2,4,2,1};
        System.out.println("Grade distribution: ");

        for (int counter = 0; counter <array.length; counter++) {
            if(counter == 10){
                System.out.println("%5d: ");
            }

        }

    }

}
