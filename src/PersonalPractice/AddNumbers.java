package PersonalPractice;

public class AddNumbers {
    public static void main(String[] args) {
        AddNumbers add = new AddNumbers();
        add.addNumbers(5,6,2,7);
    }
    public void addNumbers(int num1, int num2){
        int answer = num1 + num2;
        System.out.println(answer);
    }

    public void addNumbers(int num1, int num2, int num3){
        int answer = num1 + num2 + num3;
        System.out.println(answer);
    }

    public void addNumbers(int num1, int num2, int num3, int num4){
        int answer = num1 + num2 + num3 + num4;
        System.out.println(answer);
    }

}
