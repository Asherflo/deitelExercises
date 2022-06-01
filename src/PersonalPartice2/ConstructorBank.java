package PersonalPartice2;

public class ConstructorBank {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(int amount) {
        balance += amount;
    }
    public void  withdraw(double amount) {
        if (balance -  amount <= 0) {
            System.out.println("insufficient fund");
        }else{
            balance -= amount;
            System.out.println(balance + "withdraw amount avaliable ");
        }
    }
}
