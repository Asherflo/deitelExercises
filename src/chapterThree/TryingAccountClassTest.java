package chapterThree;

import java.util.Scanner;

public class TryingAccountClassTest {

    public static void main(String[] args) {

        Scanner wemaBank =new Scanner(System.in);

        TryingAccountClass comforter =new TryingAccountClass();
        System.out.println("please enter the name:");
        String theName = wemaBank.nextLine();
        comforter.setName(theName);


    }
    }

