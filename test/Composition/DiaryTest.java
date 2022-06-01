package Composition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


public class DiaryTest {
    private Diary1 samDiary;

    @BeforeEach
    public void setUp(){
        samDiary = new Diary1("asherflo","1234","09098702304");

    }
    @Test
    public void diaryCanBeCreatedTest(){

         Assertions.assertNotNull(samDiary);
        assertEquals("asherflo",samDiary.getUsername());
        assertEquals("09098702304",samDiary.getPhoneNumber());
//        assertEquals(0, samDiary.getNumberOfEntries());
    }
    @Test
    public void isLock(){

        assertTrue(samDiary.isLock());
    }

    @Test
    public void diaryCanBeUnlocked(){
        assertTrue(samDiary.isLock());
        samDiary.unlock("1234");
        assertFalse(samDiary.isLock());
    }

    @Test
    public void diaryCanBeLocked(){
        samDiary.unlock("1234");
        assertFalse(samDiary.isLock());
        samDiary.lock();
        assertTrue(samDiary.isLock());
    }
//    @Test
//    public void entryCanBeCreatedTest(){
//        samDiary.addEntry();
//        assertEquals(1,samDiary.getNumberOfEntries());
//
//    }
    @Test
    public void diaryCanHaveTitle(){
        samDiary.addTitle();
        assertEquals("asherflo",samDiary.getTitle());
    }
    @Test
    public void diaryHasBody(){
        samDiary.addBody();
        assertEquals("God is good",samDiary.getBody());
    }
    @Test
    public void diaryHasDate(){
        samDiary.addDate();
        assertEquals("Mon,23:05:2022,  05:44pm",samDiary.getDate());
    }
    @Test
    public void entryCanBeAddedTest(){
        samDiary.addEntry("today@semicolon","chibuzor was angry");
        samDiary.addEntry("today@semicolon","chibuzor was angry");
        assertEquals(2,samDiary.getNumberOfEntries());
    }
    @Test
    public void entryCanBeDeleted(){
        samDiary.addEntry("today@semicolon","chibuzor was angry");
        samDiary.addEntry("today@semicolon","chibuzor was angry");
        samDiary.addEntry("today@semicolon","chibuzor was angry");
        samDiary.deleteEntry("today@semicolon","chibuzor was angry");
        assertEquals(2,samDiary.getNumberOfEntries());
    }
    @Test
    public void entryCanBeDeletedByIndex(){
        samDiary.addEntry("today@semicolon","chibuzor was angry");
        samDiary.addEntry("today@semicolon","chibuzor was angry");
        samDiary.addEntry("today@semicolon","chibuzor was angry");
        assertEquals(3,samDiary.getNumberOfEntries());
        samDiary.removeByIndex(0);
        assertEquals(3, samDiary.getNumberOfEntries());
    }

    }




