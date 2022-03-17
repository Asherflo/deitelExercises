import org.junit.jupiter.api.Test;
import tddTest.Zenith;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZenithTest {
    @Test

    public  void testMultiplication(){
        //given
        Zenith five = new Zenith();
        //when
        five.deposit(200);
        five.getBalance();
        //assert
        assertEquals(200,five.getBalance());
    }
    @Test
    public void testAddition(){
        //given
        Zenith five = new Zenith();
        //when
        five.deposit(200);
        five.testAddition(2);
        five.getBalance();
        //assert
        assertEquals(400,five.getBalance());
    }
    @Test
    public void testSubtraction(){
        //given
        Zenith five = new Zenith();
        //when
        five.deposit(170);
        five.minus(30);
        //assert
        assertEquals(140,five.getBalance());
    }

@Test
    public void testQuotient(){
        //qiven
    Zenith five = new Zenith();
    //When
    five.deposit(144);
    five.quotient(10);
    //assert
    assertEquals(4,five.getBalance());

}
@Test
    public void testTwoNumbers(){
      //given
    Zenith five = new Zenith();
    //when
    five. deposit(20);
    five.anotherAddition(30);
    five.anotherThirdAddition(40);
    //assert
    assertEquals(90,five.getBalance());




}


    }






