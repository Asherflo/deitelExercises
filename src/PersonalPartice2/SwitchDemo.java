package PersonalPartice2;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month =7;
        String calendar = switch (month) {
            case 1 -> " jaunary";
            case 2 -> "february ";
            case 3 -> " march";
            case 4 -> " april";
            case 5 -> " may";
            case 6 -> " june";
            case 7 -> " july";
            case 8 -> " august";
            case 9 -> " september";
            case 10 -> " october";
            case 11 -> " november";
            case 12 -> " december";
            default -> "invalid month";
        };
        System.out.println(calendar);

        System.out.println();
        System.out.println("ENter a number");
        int n = input.nextInt();
        switch(n% 2){
            case 0:
                System.out.println("E");
                break;
            default:
                System.out.println("O");
                break;
        }
    }
}
