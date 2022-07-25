package chapterNine;

public class BasePlusCommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSale;
    private double commissionRate;
    private  double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSale, double commissionRate, double baseSalary) {
        if(grossSale < 0.00){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        if(commissionRate <= 0.0 || commissionRate >=1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        if(grossSale < 0.00){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }
    public double earning(){
        return baseSalary +( commissionRate * grossSale);
    }
     public String toString(){
         return String.format(
                 "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                 "base-salaried commission employee" , firstName, lastName,
                 "social security number", socialSecurityNumber,
                 "gross sales", grossSale, "commission rate", commissionRate,
                 "base salary", baseSalary );
     }
}
