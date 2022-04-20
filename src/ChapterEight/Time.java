package ChapterEight;

public class Time {
    private int hour;
    private int minutes;
    private int seconds;

    public  void setTime(int hour,int minutes,int seconds) {
        boolean hourIsInvalid =hour < 0 || hour >=24;
//        validate hour
//        validate minuted
//        validate seconds


        if(hourIsInvalid)throw new IllegalArgumentException("invalid hour");
        if(minutes <0 || minutes >=60)  throw new IllegalArgumentException("invalid minutes");
        if(seconds < 0 || seconds >= 60) throw new IllegalArgumentException("invalid seconds");


        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;

    }
}
