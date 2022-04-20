package PersonalTDDTest;

public class ArithmeticDivisibleByThree {


    private int number;
    private boolean result;


    public ArithmeticDivisibleByThree(int number, boolean result) {

    }

    public void setInteger(int number) {
        this.number = number;
    }

    public int getInteger() {
        return number ;
    }

    public void enterInteger(int figure) {
        if(figure % 3 == 0){
            result = true;
        }
        else{
            result = false;
        }
    }

    public boolean getAnswer() {
        return result;
    }
}
