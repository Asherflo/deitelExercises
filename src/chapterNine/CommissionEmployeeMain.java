package chapterNine;

public class CommissionEmployeeMain {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("susuz","fo","222-222-22",4567.90,0.7);

        System.out.println("Employee information obtained by get methods");
        System.out.printf("%n%s %s%n","First Name is",employee.getFirstName());

        System.out.printf("%n%s %s%n","Last Name is",employee.getLastName());

        System.out.printf("%n%s %s%n","Social security is",employee.getSocialSecurityNumber());

        System.out.printf("%n%s %s%n","Gross Sales is",employee.getGrossSales());

        System.out.printf("%n%s %s%n","Commission rate is",employee.getCommissionRate());
        employee.setGrossSales(67888.09);
        employee.setCommissionRate(0.7);
        System.out.printf("%n%s:%n%n%s%n","Update employee information obtained by toString",employee.toString());

    }
}
