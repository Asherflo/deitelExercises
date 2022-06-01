package DiaryProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class DiaryTest {
    private Diary myDiary;

    @BeforeEach
    public void setup(){
         myDiary = new Diary("asherflo","@asher123");

    }
    @Test
    public void diaryCanBeCreatedTest(){

        assertNotNull(myDiary);
    }
    @Test
    public void nameCanBeAddedTest(){


        assertEquals("asherflo",myDiary.getName());
        
    }
    @Test
    public void passwordCanBeCreated(){
        myDiary.setPassword("@asher123");
        assertEquals("@asher123",myDiary.getPassword());

    }
    @Test
    public void entryCanBeCreatedTest(){
        myDiary.addEntry("semicolon adventure","this is my semicolon journey");
        assertEquals(1,myDiary.getNumberOfEntries());

    }
    @Test
    public void entryCanBeDeletedTest(){
        myDiary.setPassword("@ashe");
        myDiary.addEntry("semicolon Adventure part 1","God is the greatest");
        myDiary.addEntry("semicolon Adventure part 2","i dont even know sef");
        myDiary.addEntry("semicolon Adventure part 3","i just want to figure it myself ");
        assertEquals(3,myDiary.getNumberOfEntries());

         assertTrue(myDiary.removeByTitle("semicolon Adventure part 1"));
        assertEquals(2,myDiary.getNumberOfEntries());

    }
    @Test
    public void removeEntryByIndexNumberTest(){
        myDiary.addEntry("semicolon Adventure part 1","God is the greatest");
        myDiary.addEntry("semicolon Adventure part 2","i dont even know sef");
        myDiary.addEntry("semicolon Adventure part 3","i just want to figure it myself ");
        assertEquals(3,myDiary.getNumberOfEntries());

        myDiary.removeByIndex(2);
        assertEquals(2, myDiary.getNumberOfEntries());

    }
    @Test
    public void controlWhatToDisplayWhenRemoveMoreThanTheIndexSizeTest(){
        myDiary.addEntry("semicolon Adventure part 1","God is the greatest");
        myDiary.addEntry("semicolon Adventure part 2","i dont even know sef");
        myDiary.addEntry("semicolon Adventure part 3","i just want to figure it myself ");
        myDiary.addEntry("semicolon Adventure part 4","Ever winning! ");
        myDiary.addEntry("semicolon Adventure part 5","Ever peaceful! ");
        assertEquals(5,myDiary.getNumberOfEntries());
        myDiary.removeByIndex(8);
        assertEquals(5, myDiary.getNumberOfEntries());

    }




    
    
    
    
    
}
