package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        int result = calculator.add(3,4);
        assertEquals(7, result);
    }
    @Test
    public void subtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(2,8);
        assertEquals(6,result);
    }
    @Test
    public void multiplicationTest(){
        Kata calculator = new Kata();
        int result = calculator.multiplication(2,2);
        assertEquals(4,result);
    }
    @Test
    public void areaOfACircle(){
        Kata calculator = new Kata();
        int result = calculator.radius(6);
        assertEquals(113,result);
    }
    @Test
    public void bitFlipperTest(){
        Kata calculator = new Kata();
        int result = calculator.flip(4);
        assertEquals(4,result);
    }
 @Test
    public void palindromeTest(){
        Kata calculator = new Kata();
        boolean result = calculator.palindrome(11211);
        assertEquals(true,result);
 }

@Test
    public void isEvenNumber(){
        Kata calculator = new Kata();
        boolean result =calculator.evenNumber(1008878);
//        assertEquals(true,result);
        assertTrue(result);

}
@Test
    public void checkTheBiggestNumber() {
    Kata calculator = new Kata();
    int result = calculator.seperateNumber(2, 9, 5, 1, 3);

    assertEquals(9, result);

}
@Test
    public  void factorsOfNumberTest(){
        Kata calculator = new Kata();
        int result = calculator. factorsOfASingleFigure(46);
        assertEquals(4,result);
}
@Test
    public void primeNumber(){
        Kata calculator = new Kata();
        boolean result = calculator.primeNumber(29);
        assertEquals(true,result);

}
@Test
    public void findMaximumOfArrayTest(){
        int[] score = {34,23,14,45,23};
        assertEquals(45,Kata.findMaximumFrom(score));
}
@Test
    public void findMinimumNumberOfArrayTest(){
    int[] score = {34,23,14,45,23};
    assertEquals(14,Kata.findMinimumfrom(score));
}



}


