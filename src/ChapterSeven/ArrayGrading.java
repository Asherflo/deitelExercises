package ChapterSeven;

import java.util.Scanner;

public class ArrayGrading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter of students: ");
        int numberOfStudent = input.nextInt();


        System.out.println("enter subject no: " );
        int numberOfSubject = input.nextInt();


        int[][] grading =new int[numberOfStudent][numberOfSubject];

            for (int i =0; i <numberOfStudent;i++) {
                for (int j = 0; j < numberOfSubject; j++) {
                    int number = i + 1;
                    int subjectIndex = j + 1;
                    System.out.println("Enter grade for student "+number+ " for subject "+subjectIndex+" : ");
                    grading[i][j] = input.nextInt();
//                    System.out.println("Score  of student "+number+" for subject "+subjectIndex+" is : "+grading[i][j]);
                }

            }

        for (int i = 0; i < numberOfSubject; i++) {
            System.out.printf("\t\t\tSubject%d",i +1);
        }
        System.out.println();
        for (int i = 0; i < numberOfStudent ; i++) {
            System.out.printf("student%d\t",i+1);
            for (int j = 0; j < numberOfSubject;j++){
                System.out.print(grading[i][j]+ "\t\t\t\t ");
            }
            System.out.println();
        }

    }
}
