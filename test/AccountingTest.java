import org.junit.jupiter.api.Test;
import tddClass.Accounting;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountingTest {
    @Test
    public void depositTest(){
        //given
        Accounting floAccount = new Accounting();
        //when
        floAccount.deposit(200);
        floAccount.getbalance();

        //assert
        assertEquals(200,floAccount.getbalance());
    }
    @Test
    public void negativeDeposit(){
        //given
        Accounting floAccount = new Accounting();
        //when
        floAccount.deposit(1000);
        floAccount.deposit(-500);
        //assert
        assertEquals(1000,floAccount.getbalance());
    }
    @Test
    public void withDrawer(){
        //given
        Accounting floAccount = new Accounting();
        // when
        floAccount.deposit(1000);
        floAccount.withDrawer(500);
        //assert
        assertEquals(500,floAccount.getbalance());
    }


    }
























