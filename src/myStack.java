/**
 * Created by Jakob on 02-10-2016.
 */

class myStack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    //--------------------------------------------------------------

    public myStack(int s) {

        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {

        stackArray[++top] = j;
    }

    public long pop() {

        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }

}
class StackApp
{
    public static void main(String[] args) {
        myStack stack = new myStack(10);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);

        while( !stack.isEmpty() ) {
            long value = stack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}

