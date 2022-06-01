package DataStructure;

import DataStructure.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set set;
    @BeforeEach
    public void setUp(){
        set = new Set();
    }
    @Test
    public void SetCanBeCreated() {
        assertNotNull(set);
    }

    @Test
    public void setIsEmpty() {
        assertFalse(set.isEmpty());
    }
    @Test
    public void setCanAdd(){
        set.add("java");
        set.add("is");
        set.add("not");
        set.add("your");
        set.add("mate");
        set.add("mate");
        assertEquals(5,set.size());
    }
    @Test
    public void toCheckAllContainsInSetTest(){
        set.add("java");
        set.add("is");
        set.add("not");
        set.add("your");
        set.add("mate");
        System.out.println(set.toString());
    }
    @Test
    public void toFindContainsInSetTest(){
        set.add("java");
        set.add("is");
        set.add("not");
        set.add("your");
        set.add("mate");
        set.contains("your");
        assertTrue(set.contains("your"));
    }
    @Test
    public void toRemoveAnItemTest(){
        set.add("java");
        set.add("is");
        set.add("not");
        set.add("your");
        set.add("mate");
        set.remove("mate");
        assertEquals(4,set.size());
    }


    }

