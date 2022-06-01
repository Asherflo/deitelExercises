package ChapterSix;

import java.security.SecureRandom;

public class WorkingWithRandomNumbers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();


        for (int counter = 1; counter <= 20 ; counter++) {
            int randomValue = 2 + 3* randomNumbers.nextInt(10);
            System.out.print(" "+randomValue);

//            if(counter % 5 == 0){
//                System.out.println();
//            }

        }
    }
}
