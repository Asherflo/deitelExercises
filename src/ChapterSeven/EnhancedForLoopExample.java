package ChapterSeven;

public class EnhancedForLoopExample {
    public static void main(String[] args) {
        int[] array ={ 23,56,87,90,32,10,85,91,87};
        int total = 0;
        for(int number: array){
            total += number;
        }
        System.out.println(total);

    }

}
