package DataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MyHashMapTest {
    private  MyHashMap hashMap;
    @BeforeEach
    public void setUp(){
        hashMap = new MyHashMap();
    }
    @Test
    public void HaspMapCanBeCreated(){
        assertNotNull(hashMap);
    }
    @Test
    public void hashMapIsEmpty(){
       assertTrue( hashMap.isEmpty());
    }
    @Test
    public void hashMapCanAdd(){
        hashMap.add("shoe","paris");
        assertEquals(1,hashMap.size());
        assertFalse(hashMap.isEmpty());
    }
    @Test
    public void hashMapCanAddMoreItems(){
        hashMap.add("shoe","paris");
        hashMap.add("wear","italy");
        hashMap.add("win","england");
        assertEquals(3,hashMap.size());
        assertFalse(hashMap.isEmpty());
    }
    @Test
    public void  hashMapCanGetValueByKey(){
        hashMap.add("shoe","paris");
        hashMap.add("wear","italy");
        hashMap.add("win","england");
        assertEquals(3,hashMap.size());
        assertEquals("england",hashMap.getvalue("win"));
    }
    @Test
    public void  hashMapCanGetkeyByValue(){
        hashMap.add("shoe","paris");
        hashMap.add("wear","italy");
        hashMap.add("win","england");
        assertEquals(3,hashMap.size());
        assertEquals("win",hashMap.getKey("england"));
    }
    @Test
     public void hashMapCanReplaceByValue() {
         hashMap.add("shoe","paris");
         hashMap.add("wear","italy");
         hashMap.add("win","england");
         hashMap.replace("wear","denmark");
         assertEquals(3,hashMap.size());
         assertEquals("denmark",hashMap.getvalue("wear"));
     }
     @Test
    public void hashMapCanRemove() {
         hashMap.add("shoe","paris");
         hashMap.add("wear","italy");
         hashMap.add("win","england");
         hashMap.add("apc","joke");;
         hashMap.remove(3);
         assertEquals(3,hashMap.size());
         assertNull(hashMap.getvalue("apc"));
         assertNull(hashMap.getKey("joke"));


     }
    @Test
    public void hashMapCanMove() {
        hashMap.add("shoe", "paris");
        hashMap.add("wear", "italy");
        hashMap.add("win", "england");
        hashMap.add("apc", "joke");
        hashMap.remove(0);
        assertEquals(3, hashMap.size());

    }
    }
