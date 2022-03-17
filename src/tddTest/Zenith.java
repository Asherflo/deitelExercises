package tddTest;

public class Zenith {
private int balance;
private int amount;
private int anotherBalance;


    public void deposit(int amount) {
        balance = amount + balance;
    }

    public int getBalance() {
        return balance;
    }

    public void testAddition (int amount) {
            balance = balance  * amount;
    }


    public void minus(int amount) {
        balance =balance - amount;
    }

    public void quotient(int used) {
        balance =  balance % used
        ;
    }

    public void anotherAddition(int amount) {
        anotherBalance =balance + amount;

    }

    public void anotherThirdAddition(int number) {
        balance =anotherBalance +amount+ number;
    }
    
    //public int getAnotherBalance(){
        

            
}







