package tddClass;

public class Accounting {
    private int balance;
    public void deposit(int amount) {
        if (amount > 0)
            balance = amount + balance;
    }

    public int getbalance() {
        return balance;
    }

    public void withDrawer(int amount) {
        if(amount > 0)
            balance = balance - amount;
    }
}
