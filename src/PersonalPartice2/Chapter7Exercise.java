package PersonalPartice2;

public class Chapter7Exercise {
    public static void main(String[] args) {
        int []numbers = {10,11,12,13,14,15,16,17,18,19,20};
        int total = 0;
        for(int element: numbers){
            total += element*2;
            System.out.println(total);
        }
        System.out.println();

    }
}
