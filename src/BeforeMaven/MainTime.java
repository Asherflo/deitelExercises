package BeforeMaven;

public class MainTime {
    public static void main(String[] args) {
        Time time = new Time();
        

        displayTime("After time object is created ",time);
        time.setTime(12,9,34);
        displayTime("after calling setTime",time);
        System.out.println();
        try{
            time.setTime(99,99,99);
        }
        catch (IllegalArgumentException e ){
            System.out.printf("Exception:%s%n%n",e.getMessage());
        }
        displayTime("After calling setTime  with invalid values",time);
    }

    private static void displayTime(String header, Time t) {
        System.out.printf("%s%nUniversal Time :%s%nStandard time: %s%n "
                , header, t.toUniversalString(),t.toString());
    }
}
