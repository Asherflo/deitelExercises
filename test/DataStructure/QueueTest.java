package DataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class QueueTest {
    private Queue queue;
    @BeforeEach
    public void setUp(){
        queue = new Queue();
    }


        @Test
        public void canAQueueBeCreated(){

            assertNotNull(queue);
        }
        @Test
        public void queueIsEmptyTest(){

            assertTrue(queue.isEmpty());
        }
        @Test
        public void addAnElementInsideTheQueueTest(){
            queue.add(349);
            assertEquals(1, queue.size());
            assertFalse(queue.isEmpty());
        }
        @Test
        public void weCanAddMultipleElementsInTheQueueANdPeekTest(){
            queue.add(3467);
            queue.add(2344);
            queue.add(234556);
            queue.add(234658);
            queue.add(23235434);
            queue.add(2233534);
            assertEquals(6, queue.size());
            assertEquals(3467, queue.peek());
        }
        @Test
        public void ourQueueHasAFixedLengthTest(){
            queue.add(234);
            queue.add(2344);
            queue.add(234556);
            queue.add(234658);
            queue.add(23235434);
            queue.add(2233534);
            queue.add(5674);
            queue.add(7896);
            queue.add(234556);
            queue.add(234658);
            queue.add(23235434);
            queue.add(225678);
            assertEquals(10, queue.size());
        }
        @Test
        public void testThatWhenWeRemoveFromTheQueueItIsTheFirstElement(){
            queue.add(234);
            queue.add(2344);
            queue.add(234556);
            queue.add(234658);
            queue.add(23235434);
            queue.add(2233534);
            queue.add(234);
            queue.add(2344);
            queue.add(234556);
            assertEquals(9, queue.size());
            queue.remove();
            int element = queue.peek();
            assertEquals(2344, element);
            assertEquals(8, queue.size());
//        queue.remove();
//        element = queue.peek();
//        assertEquals(234556, element);

        }

    }

