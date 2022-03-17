package tddClass;

import chapterThree.FirstTestInChapterThree;

import java.util.Scanner;

public class FirstTestInChapterThreeTest {
    public static void main(String[] args) {
        Scanner figure = new Scanner(System.in);

        FirstTestInChapterThree myJoy = new FirstTestInChapterThree();
        System.out.printf("Initial name is: %s%n%n",myJoy.getName());//this method is called to initialize the name i

        System.out.println("please enter the name:");
        String myName = figure.nextLine();

        myJoy.setName(myName);

        System.out.printf("Name in object myJoy is:%n%s%n",myJoy.getName());

    }
}
