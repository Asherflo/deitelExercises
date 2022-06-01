package Assignment;

import static org.junit.jupiter.api.Assertions.*;

class GradeBookMainTest {
    public static void main(String[] args) {
        int[ ] gradeArray ={87,68,94,100,83,78,85,91,76,87};
        GradeBook myGradeBook = new GradeBook("CS101 introduction to java",gradeArray);
        System.out.printf("welcome to the grade book for %n%s%n%n",myGradeBook.getCourseName());
        myGradeBook.processGrade();
    }

}