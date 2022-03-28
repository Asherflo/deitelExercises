package tddTest;

import chapterThree.FirstAccountInChapterThree;

import java.util.Scanner;

public class FirstAccountInChapterThreeTest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        FirstAccountInChapterThree myAccount = new FirstAccountInChapterThree();

        System.out.printf("Initial name is %s%n%n", myAccount.getName());
        System.out.println("Please enter the name");
        String theName = input.next();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in the object myAccount is :%n%s%n",myAccount.getName());



    }
}
