package chapterNine;

public class PlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    public PlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate,double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary< 0.00){
            throw new IllegalArgumentException("Base salary must be greater than 0.00");
            }
            this.baseSalary = baseSalary;
        }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) { if (baseSalary< 0.00){
        throw new IllegalArgumentException("Base salary must be greater than 0.00");
    }
        this.baseSalary = baseSalary;
    }
    public  double earning(){
        return  baseSalary + (commissionRate* grossSales);

    }
    public String toString(){
        return  String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate,
                "base salary", baseSalary);
    }

}

