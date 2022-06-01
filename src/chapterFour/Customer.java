package chapterFour;

public class Customer {
    private String accountNumber;
    private int balanceAtBeginning;
    private int totalItemsCharged;
    private int creditApplied;
    private  int creditLimit;


    public Customer(String accountNumber, int balance, int totalCharges, int creditApplied, int creditLimit) {
        this.accountNumber = accountNumber;
        balanceAtBeginning = balance;
        totalItemsCharged = totalCharges;
        this.creditApplied = creditApplied;
        this.creditLimit = creditLimit;
    }

    public Customer(){}

    public String getAccountNumber() {
        return accountNumber;
    }

    public int calculateBalance() {
        return balanceAtBeginning + totalItemsCharged - creditApplied;
    }

    public int displayNewBalance() {
        return calculateBalance();
    }

    public boolean validateCreditLimitExceeded() {
        if (displayNewBalance() > creditLimit){
            displayMessage();
            return true;
        }
        return false;
    }

    public void displayMessage() {
        if (displayNewBalance() > creditLimit){
            System.out.println("Credit Limit Exceeded");
        }
    }
}
