package chapterFour;

public class CreditLimitCalculatorTest {
    public static void main(String[] args) {
        CreditLimitCalculator beatrice = new CreditLimitCalculator("",0,0,0,300_000);

        beatrice.setAccountNumber("0168924692");
        beatrice.setBalanceAtBeginning(200_000);
        beatrice.setTotalItemsCharged(350_975);
        beatrice.setCreditApplied(150_000);


        System.out.println("Beatrice account number is " +beatrice.getAccountNumber());
        System.out.println("account balance is " + beatrice.getBalanceAtBeginning());
        System.out.println(beatrice.getTotalItemsCharged()+ " was brought");
        System.out.println(beatrice.getCreditApplied()+ " is the is the total credit applied to Beatrice's account ");
        System.out.println("the new balance of beatrice is "+ beatrice.getNewBalanceAfterCreditCharges());


    }
}
