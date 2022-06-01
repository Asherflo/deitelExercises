package PersonalPartice2;

public class MainConstructorBank {
    public static void main(String[] args) {
        ConstructorBank zenith = new ConstructorBank();
            zenith.setCustomerName("Asher Florence");
            zenith.getCustomerName();
            zenith.withdraw(100);
            zenith.depositFunds(50);
            zenith.withdraw(100);
            zenith.depositFunds(51);
            zenith.withdraw(100);
    }
}
