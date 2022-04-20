package PersonalTDDTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;

public class ArithmeticDivisibleByThreeTest {
    ArithmeticDivisibleByThree value;


    @BeforeEach
    public  void startWith(){
        value = new ArithmeticDivisibleByThree(12,false);
    }
    @Test
    public void enterInteger() {
        value.setInteger(65);
        assertEquals(65,value.getInteger());
    }
    @Test
    public void ifNumberIsDivisibleByThree() {
        value.enterInteger(65);
        assertFalse(value.getAnswer());
    }

}
