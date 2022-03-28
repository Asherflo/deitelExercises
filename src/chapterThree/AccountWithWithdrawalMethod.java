package chapterThree;

public class AccountWithWithdrawalMethod {
    private  String name;
    private  double balance;

    public AccountWithWithdrawalMethod(String name,double balance){
        this.name =name;
        if(balance > 0.0){
            this.balance = balance;
        }
    }
    public void deposit(double depositAmount){
        if(depositAmount > 0.00){
            balance = balance + depositAmount;
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public void setName(String name){
        this.name= name;
    }
    public void withdrawal(double withdrawAmount){
        if(balance > withdrawAmount){
            balance = balance - withdrawAmount;
        }else if(balance > withdrawAmount){
            this.balance =balance;
        } else{
            System.out.println("withdrawal amount exceeded account balance");
        }
    }




}
