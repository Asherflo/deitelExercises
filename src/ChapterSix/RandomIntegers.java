package ChapterSix;

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        for (int counter = 1; counter <= 20; counter++) {
            int input = 1 + randomNumbers.nextInt(15);
            System.out.printf("%d ", input);

            if (counter % 5 == 0) {
                System.out.println();

            }
        }
    }
}