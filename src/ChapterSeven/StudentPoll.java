package ChapterSeven;

public class StudentPoll {
    public static void main(String[] args) {
        int [] responses = {1,2,5,4,5,5,1,1,1,4,5,3,4,5,4,1,5,3,2,14};
        int [] frequency =new int[6];
        for (int i = 0; i < responses.length; i++) {
            try {
                ++frequency[responses[i]];
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("responses [%d] =%d%n%n" ,i,responses[i]);
            }
        }
        System.out.printf("%s%15s%n","Rating","frequency");
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%15d%n",rating ,frequency[rating]);

        }

    }
}
