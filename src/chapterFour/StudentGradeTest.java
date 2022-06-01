package chapterFour;

public class StudentGradeTest {
    public static void main(String[] args) {
        StudentGrade account1 = new StudentGrade("Aniyikaye Temitope",98.83);
        StudentGrade account2 = new StudentGrade("iseoluwanimi",65.98);

        System.out.printf("%s's  letter grade is: %s%n ",account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's  letter grade is: %s%n ",account2.getName(), account2.getLetterGrade());

}
}
