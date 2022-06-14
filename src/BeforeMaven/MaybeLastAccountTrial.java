package BeforeMaven;

public class MaybeLastAccountTrial {
    private String name;
    private double balance;

    public MaybeLastAccountTrial(String name,double balance) {
        this.name = name;
        if (balance > 0.00) {
            this.balance = balance;
        }
    }
    public void deposit(double depositAmount){
        if(depositAmount > 0.00){
            balance = balance+ depositAmount;
        }

    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void  withdrawAmount(double amount) {
        if(amount > balance){
            System.out.println("insufficient fund");
        } else {
            balance = balance - amount;
        }

    }
}
