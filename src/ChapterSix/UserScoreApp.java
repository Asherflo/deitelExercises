package ChapterSix;

import java.security.SecureRandom;

public class UserScoreApp {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        for (int roll = 1; roll <= 20; roll++) {
            int input = 1 + random.nextInt(20);

            int randomNumber1 = random.nextInt(20);
            int randomNumber2 = random.nextInt(20);
            int operator = random.nextInt(4);

            switch (operator){
                case 1:

//                    System.out.print( "randomNumber1" "+" "randomNumber2"); //Two things will not be in a string quote there; then you have to add +

            }

        }
    }
}