package chapterThree;

public class Account1 {
    private String accountName;
    private String accountNumber;
    private int pin;
    private int balance;

    public Account1 (String  accountName, String accountNumber){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public String getAccountName () {
        return accountName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public  void setAccountName (String name){
      accountName = name;
    }

    public void setPin(int password){
        pin = password;

    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
