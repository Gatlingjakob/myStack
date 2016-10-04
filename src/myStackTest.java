import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jakob on 04-10-2016.
 */
public class myStackTest {

    myStack stack = new myStack(5);
    myStack emptyStack = new myStack(0);
    myStack fullStack = new myStack(3);

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
        long i = stack.peek();
        assertEquals(i, 4);
    }

    @org.junit.Test
    public void pop() throws Exception {
        long i= stack.pop();
        assertEquals(i, 3);
        long j =stack.peek();
        assertEquals(j, 2);

    }

    @org.junit.Test
    public void peek() throws Exception {
    long i = stack.peek();
        assertEquals(i,3);
    }

    @org.junit.Test
    public void isEmpty() throws Exception {
    boolean empty = emptyStack.isEmpty();
        assertEquals(empty, true);
    }

    @org.junit.Test
    public void isFull() throws Exception {
        boolean full = fullStack.isFull();
        assertEquals(full, true);
    }

}