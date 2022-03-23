package tddClass;

public class Kata {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        if (num1 > num2) {
            return num1 - num2;
        }
        return num2 - num1;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int radius(int radius) {
        return (22 * radius * radius) / 7;
    }

    public int flip(int digit) {
        if (digit == 1) {
            return 0;
        } else if (digit == 0) {
            return 1;
        }
        return digit;

    }

    public boolean palindrome(int digit) {
        int num5 = (digit % 100000) / 10000;
        int num4 = (digit % 10000) / 1000;
        int num3 = (digit % 1000) / 100;
        int num2 = (digit % 100) / 10;
        int num1 = (digit % 10);

        if (num5 == num1 && num4 == num2) {
            return true;
        }
        return false;
    }

    public boolean evenNumber(int digit) {
        if (digit % 2 == 0) {
            return true;
        } else if (digit % 2 == 1) {
            return false;
        }
        return false;

    }

    public int seperateNumber(int num1, int num2, int num3, int num4, int num5) {
        int digit = 0;
        if (num1 > digit) digit = num1;
        if (num2 > digit) digit = num2;
        if (num3 > digit) digit = num3;
        if (num4 > digit) digit = num4;
        if (num5 > digit) digit = num5;
        return digit;


//        if (num1 > num2 && num1 > num3)
//            if (num1 > num4 && num1 > num5) {
//                digit = num1;
//            } else if (num1 > num2 && num1 > num3)
//                if (num1 > num4 && num1 < num5) {
//                    digit =num2;
//                } else if (num1 > num2 && num1 > num3)
//                    if (num1 < num4 && num4 < num5) {
//                        digit = num4;
//                    } else if (num1 > num2 && num2 < num3)
//                        if (num3 < num4 && num3 < num5) {
//                            digit= num3;
//                            {
//                                return num5;
//                            }
//                        }
//
//
//        return digit;
    }


    public int factorsOfASingleFigure(int number) {

        int digit = 1;
        int count = 0;
        while (digit <= number) {
            if (number % digit == 0) {
                count++;

            }
            digit = digit + 1;
        }

        return count;
    }


    public boolean primeNumber(int number) {
            boolean gee = false;
            int digit = 1;
            int count = 0;
            while (digit <= number) {
                if (number % digit == 0) {
                    count++;

                }
                digit = digit + 1;
            }
            if(count<=2)
                gee =true;
            return gee;
//
//
//    }
    }
}