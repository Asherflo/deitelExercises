package chapterFour;

public class CreditLimitCalculator {
    private String accountNumber;
    private int balanceAtBeginning;
    private int totalItemsCharged;
    private int creditApplied;
    private  int creditLimit;

    public CreditLimitCalculator(String accountNumber, int balanceAtBeginning, int totalItemsCharged, int creditAllowed, int creditLimit){
        this.accountNumber = accountNumber;
        this.balanceAtBeginning = balanceAtBeginning;
        this.totalItemsCharged = totalItemsCharged;
        this.creditApplied = creditAllowed;
        this.creditLimit = creditLimit;
    }


    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
      public void setBalanceAtBeginning(int balanceAtBeginning){
        this.balanceAtBeginning = balanceAtBeginning;
    }
    public int getBalanceAtBeginning(){
        return balanceAtBeginning;
    }
    public void setTotalItemsCharged(int totalItemsCharged){
        this.totalItemsCharged = totalItemsCharged;
    }
    public int getTotalItemsCharged(){
        return totalItemsCharged;
    }


    public int getCreditApplied() {
        return creditApplied;
    }

    public void setCreditApplied(int creditApplied) {
        this.creditApplied = creditApplied;
    }

    public int getNewBalanceAfterCreditCharges(){
      int newBalanceAfterCreditCharges =
        balanceAtBeginning + (totalItemsCharged - creditApplied);

      if(newBalanceAfterCreditCharges > creditLimit){
          System.out.println("credit limit exceeded");
      }

        return newBalanceAfterCreditCharges;
    }


}