package chapterNine;

public class HourlyEmployee extends CommissionEmployee{
    private  double hours;
    private double wages;


    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate,double hours,double wages) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if(wages < 0.00){
            throw new IllegalArgumentException("Wages must be >= 0.0");
        }
        this.wages = wages;
        if(hours < 0 || hours > 168){   this.hours = hours;
            throw new IllegalArgumentException("hour must be > 0  and < 168");
        }
        this.hours = hours;
    }

}
