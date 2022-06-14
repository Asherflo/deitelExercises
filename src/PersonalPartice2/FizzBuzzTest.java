package PersonalPartice2;

public class FizzBuzzTest {
    public static void main(String[] args) {
//        a program that print 1  to 100
//        but for multiples of three print fizz
//        and for multiples of five  print  buzz
//        and for number of both three and five print fizzbuzz
        int number = 0;
        for (int i = 0; i < 100; i++) {
            number++;

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");

                if (number % 3 == 0) {
                    System.out.println("fizz");

                } else if (number % 5 == 0) {
                    System.out.println("buzz");


                } else System.out.println(number);


            }

        }
    }
}
