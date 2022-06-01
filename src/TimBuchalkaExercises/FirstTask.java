package TimBuchalkaExercises;

public class FirstTask {
    private String accountNumber;
    private double balance;
    private String accountName;
    private String email;
    private String phoneNumber;

    public FirstTask(String accountNumber, double balance, String accountName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = accountName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String s) {
        this.accountNumber = accountNumber;
        accountNumber = "01684692";
    }

    public void deposit(int amount) {
        balance += amount;


    }

    public double getBalance() {

        return balance;
    }

    public void withdraw(double amount) {

        if(balance > amount){
            balance -=amount;
            System.out.println("successful");
        }
        else
            System.out.println("insufficient fund");
    }


}


