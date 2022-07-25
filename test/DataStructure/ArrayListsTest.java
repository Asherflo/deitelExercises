package DataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListsTest {
    private ArrayList<String> list;
    @BeforeEach
    public void setUP(){
        list = new ArrayList<String>();
    }
    @Test
    public void arrayListIsEmpty(){
        list.isEmpty();
        assertTrue(true);
    }
    @Test
    public void arrayListCanAddTest() {

        list.add("ifedolapo");
        assertEquals(1, list.size());
    }
    @Test
    public void arrayListCanAddMoreThanElement(){
        list.add(0,"ifedolapo");
        list.add(1,"florence");
        list.add(2,"samson");
        list.add(3,"yemyem");
        assertEquals("ifedolapo",list.get(0));
        assertEquals(4,list.size());
    }
    @Test
    public void arrayListCanReplaceElements(){
        list.add(0,"ifedolapo");
        list.add(1,"florence");
        list.add(2,"samson");
        list.add(3,"yemyem");
        assertEquals("samson",list.set(2,"funmi"));
        assertEquals("funmi",list.get(2));
    }
    @Test
    public void arrayListCanRemoveElements(){
        list.add(0,"ifedolapo");
        list.add(1,"florence");
        list.add(2,"samson");
        list.add(3,"yemyem");
        assertEquals("samson",list.remove(2));
        assertEquals(3,list.size());
    }

}
