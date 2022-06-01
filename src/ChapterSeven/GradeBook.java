package ChapterSeven;

public class GradeBook {
    private String instructorName;
    private String studentName;
    private int[] grade;

    public GradeBook(String instructorName, String studentName) {
        this.instructorName = instructorName;
        this.studentName = studentName;
    }

    public void addInstructor(String name) {
        instructorName = name;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void addStudentName(String name) {
        studentName = name;
    }

    public String getStudentName() {
        return studentName;
    }

    public int addGrades(int[] grades) {
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }
        return total;
    }

    public int highestGrade(int[] grades) {
        int max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) max = grades[i];
        }
        return max;
    }

    public int smallestGrade(int[] grades) {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) min = grades[i];

        }
        return min;
    }

    public int averageGrade(int[] grades) {
        int average = 0;
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
            average = total / grades.length;
        }
        return average;
    }
}