package DiaryProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class EntryTest {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E,dd:MM:yyyy,  hh:mma");
   private String  date = dateTimeFormatter.format(LocalDateTime.now());
   private Entry entry;

   @BeforeEach
   public void setUp(){
       entry = new Entry("Asherflo","gbesoulyeh");
   }

    @Test
    public void entryCanBeCreatedTest(){

        assertNotNull(entry);
    }
    @Test
    public void dateCanBeCreatedTest(){

        assertEquals(date,entry.getDate());
    }
    @Test
    public  void titleCanBeCreatedTest(){
       assertEquals("Asherflo",entry.getTitle());
    }
    @Test
    public void bodyCanBeCreatedTest(){
       assertEquals("gbesoulyeh",entry.getBody());
    }



}
