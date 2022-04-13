package dsa;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.testng.AssertJUnit.*;

public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp(){
        stack =new Stack();
    }

    @Test
    public void stackCanBeCreated() {
        Stack stack = new Stack();
        assertNotNull(stack);
    }
    @Test
    public void stack_Is_Empty(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushOneElement_stack_is_empty(){
        Stack stack = new Stack();
        stack.push(13);
        assertFalse(stack.isEmpty());
    }
    @Test
    public void pushX_popX_stackShouldBeEmptyTest(){
        Stack stack = new Stack();
        stack.push( 16);

        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushXandY_popY_stackShouldNotBeEmptyTest(){
        Stack stack = new Stack();
        stack.push(16);
        stack.push(29);
        stack.pop();
        assertFalse(stack.isEmpty());

    }
    @Test
    public void pushX_popX_elementShouldBeXTest(){
        Stack stack = new Stack();
        stack.push(34);
        int element = stack.pop();
        assertEquals(34,element);
    }
    @Test
    public void  pushXandY_popXandY_elementIsYthenXtest(){
        Stack stack = new Stack();
            stack.push(34);
            stack.push(67);
            int element = stack.pop();
            assertEquals(67,element);
            element = stack.pop();
        assertEquals(34,element);

    }
    @Test
    public void pushXandY_peektrunsYtest(){
        Stack stack = new Stack();
        stack.push(32);
        stack.push(69);
        int element = stack.peek();
        assertEquals(69,element);
        element= stack.pop();
        assertEquals(69,element);
        element = stack.peek();
        assertEquals(32,element);




    }
}
