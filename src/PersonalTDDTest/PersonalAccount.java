package PersonalTDDTest;

public class PersonalAccount {


    private  int balance;
    private String name;

    public PersonalAccount(String name, String FINAL_PIN) {
         this.name = name;

    }

    public void setName(String firstName, String lastName) {
        name = firstName + " " +lastName;

    }

    public String getName() {
        return name;
    }


    public void deposit(int amountDeposited) {
        balance = balance +amountDeposited;
    }

    public int getBalance() {
        return balance;
    }

    public void initialBalance(int amount) {
        balance = balance + amount;

    }

    public void withdraw(int amount ) {
        balance = balance - amount;
    }

    public void totalBalance(int amount) {
        balance = balance + amount;

    }

    public void withdrawAmount(int amount) {
            if(balance < amount) {
                balance = balance;
            }
            else{
                balance = balance - amount;
            }

    }

    public void checkBalance(int amount) {
        balance = amount + balance;
    }

}







