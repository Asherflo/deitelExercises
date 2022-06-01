package Assignment;

public class GradeBook {
    private String courseName;
    private int[] grades;
    public GradeBook (String courseName, int[] grades) {
        this.courseName= courseName;
        this.grades= grades;
    }
    public  void setCourseName(String courseName) {
        this.courseName= courseName;
    }
    public String getCourseName() {
        return courseName;
    }
    public void processGrade(){
        outputGrade();
    }

    private void outputGrade() {
        System.out.printf("The grade are: %n%n");
        System.out.printf("%nClass average is %.2f%n",getAverage());
       System.out.printf("lowest grade is %d%n highest grade is %Highest grade is %d%n%n", getMinimum(),getMaximum());
    }

    private int getMaximum() {
        int maximum = grades[0];
        for (int i = 0; i < grades.length; i++){
            if(grades[i] > maximum)maximum = grades[i];
        }
        return maximum;
    }

    private int getMinimum() {
        int lowGrade = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if(grades[i] < lowGrade) lowGrade = grades[i];
        }
        return lowGrade;

    }

    private double getAverage() {
       int total = 0;
       for(int grade :grades) {
           total += grade;
       }
       return (double) total /grades.length;

    }

}
