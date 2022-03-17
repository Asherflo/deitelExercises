package tddClass;

import org.junit.jupiter.api.Test;

public class KataTest{
//    @Test
//    public void quotientTest(){
//        //given
//        Kata kata = new Kata();
//        //when
//        kata.figure(100,50);
//    }

    @Test
    public void whileTest(){
//        Kata kata = new Kata();
        int number =0;
        while(number < 99){
            System.out.print(number+ " ,");
          // if(number% 2== 0)
            number =number + 2;


        }
        System.out.print(number+ "......... ");
    }


}
