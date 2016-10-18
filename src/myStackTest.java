import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jakob on 04-10-2016.
 */
public class myStackTest {

    myStack stack = new myStack();
    myStack emptyStack = new myStack();
    myStack fullStack = new myStack();

    @org.junit.Before
    public void setUp() throws Exception {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        fullStack.push(1);
        fullStack.push(2);
        fullStack.push(3);
    }

    @org.junit.Test
    public void push() throws Exception {
    stack.push(4);
        Object i = stack.peek();
        assertEquals(i, 4);
    }

    @org.junit.Test
    public void pop() throws Exception {
        Object i= stack.pop();
        assertEquals(i, 3);
        Object j =stack.peek();
        assertEquals(j, 2);

    }

    @org.junit.Test
    public void peek() throws Exception {
    Object i = stack.peek();
        assertEquals(i,3);
    }

    @org.junit.Test
    public void isEmpty() throws Exception {
    boolean empty = emptyStack.isEmpty();
        assertEquals(empty, true);
    }


}