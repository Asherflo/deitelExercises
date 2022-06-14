//package Inheritance;
//
//public class CommissionEmployee extends Object {
//    private final String firstName;
//    private final String lastName;
//    private final String socialSecurityNumber;
//    private double grossSales;
//    private double commissionRate;
//
//    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.socialSecurityNumber = socialSecurityNumber;
//        this.grossSales = grossSales;
//        this.commissionRate = commissionRate;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getSocialSecurityNumber(){
//        return socialSecurityNumber;
//    }
//    public void setGrossSales(double grossSales) {
//        if(grossSales< 0.00){
//            throw new IllegalArgumentException("gross sales must be >= 0.00");
//        }
//        this.grossSales = grossSales;
//    }
//    public double getGrossSales() {
//        return grossSales;
//    }
//    public void setCommissionRate(double commissionRate) {
//        if(commissionRate <= 0.00 || commissionRate >=1.0){
//            throw new IllegalArgumentException("commission rate must be > 0.0 and < 1.0");
//        }
//        this.commissionRate = commissionRate;
//    }
//    public  double getCommissionRate(){
//        return commissionRate;
//    }
//    public double earnings() {
//        return commissionRate* grossSales;
//    }
//
//    @Override
//    public String toString(){
//        return String.format("%s:  %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
//                "commission employee",firstName,lastName,
//                "social security  number",socialSecurityNumber,
//                "gross sales",grossSales,
//                "commission rate ",commissionRate);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              "
//
//    }
//
//
//
//
//}
