package TimBuchalkaExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class FirstTaskTest {

    private FirstTask myBankAccount;

    @BeforeEach
    public void setup() {
        myBankAccount = new FirstTask("", 0.00, "ty", "rt@w", "er");
    }

    @Test
    public void accountCanBeCreated() {
        assertNotNull(myBankAccount);
    }

    @Test
    public void accountDetailsIsValidated() {
        assertNotNull(myBankAccount);

    }
    @Test
    public void accountNumberCanBeCreatedTest(){
        myBankAccount.setAccountNumber("01684692");
        assertEquals("01684692",myBankAccount.getAccountNumber());
    }
    @Test
    public void toDepositTest(){
        myBankAccount.deposit(10_000_000);
        assertEquals(10_000_000,myBankAccount.getBalance());
    }
    @Test
    public void toDepositTwiceTest(){
        myBankAccount.deposit(20_000_000);
        myBankAccount.deposit(32_000_000);
        myBankAccount.deposit(20_000_000);
        assertEquals(72_000_000,myBankAccount.getBalance());

    }
    @Test
    public void withdrawTest(){
        myBankAccount.deposit(9000);
        myBankAccount.withdraw(9700);
        assertEquals(9000,myBankAccount.getBalance());
    }


}
