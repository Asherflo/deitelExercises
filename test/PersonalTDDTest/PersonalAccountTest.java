package PersonalTDDTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class PersonalAccountTest {
    PersonalAccount asher;
    @BeforeEach
    public void startWith(){
        asher = new PersonalAccount("Temitope asher","1234");

    }
    @Test
    public void createAccount(){
        assertNotNull(asher);
    }
@Test
    public void falseNameAccount(){
        asher.setName("Temitope","asher");
        assertEquals("Temitope asher",asher.getName());
}
@Test
public  void depositAmountTest(){
        asher.deposit(5000);
        assertEquals(5000,asher.getBalance());
}
@Test
    public void withdrawals(){
        asher.initialBalance(4000);
        asher.withdraw(2000);
        assertEquals(2000,asher.getBalance());
}
@Test
    public void withdrawMoreThanYourBalance(){
        asher.totalBalance(4000);
        asher.withdrawAmount(7000);
        assertEquals(4000,asher.getBalance());
}
@Test
    public void checkBalanceTest(){
        asher.checkBalance(3000);
        assertEquals(3000,asher.getBalance());

}
}

