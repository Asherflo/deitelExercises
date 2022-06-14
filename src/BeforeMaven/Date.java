package BeforeMaven;

public class Date {
    private int month;
    private int day;
    private int year;
    private static final int[] daysPerMonth = {0,31,28,31,30,31,31,30,31,31,30,31,30,31};
    public  Date(int year, int month, int day){
        if(month <= 0 || month > 12){
            throw new IllegalArgumentException("month(" + month + ") must be 1-12");
        }
//        if ( day <= 0 ||(daysPerMonth[month]) && !(month == 2 ))
    }
}
