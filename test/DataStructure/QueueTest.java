package DataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class QueueTest {
    private QueueSample queue;
    @BeforeEach
    public void setUp(){
        queue = new QueueSample();

    }
    @Test
    public void QueueCanBeCreatedTest() {
        assertNotNull(queue);
    }
    @Test
    public void queueIsEmpty() {
        assertFalse(queue.isEmpty());

    }
    @Test
    public void queueCanAdd(){
//        queue.add(10);
//        queue.add(10);
//        assertEquals(10, queue.)

    }
}

