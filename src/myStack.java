
         import java.util.Iterator;
         import java.util.NoSuchElementException;

public class myStack<E> implements Iterable<E> {

    private int size;
    private Node first;

    private class Node{
        Node next;
        E item;
    }

    public myStack(){

        first =null;
        size=0;

    }

    public boolean isEmpty(){
        return first == null;
    }

    public void push(E item){

        Node oldNode = first;

        first=new Node();
        first.item=item;
        first.next=oldNode;
        size++;
    }

    public E pop(){

        if(isEmpty()){
            throw new RuntimeException("stack underflow");
        }

        E item=first.item;
        first=first.next;
        size--;

        return item;

    }

    public E peek(){

        if(isEmpty()){
            throw new RuntimeException("stack underflow");
        }
        return first.item;

    }

    public Iterator<E> iterator(){
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E>{

        private Node currentNode = first;

        public boolean hasNext() {

            return currentNode != null;

        }


        public void remove() {

            throw new UnsupportedOperationException("not allowed");

        }

        public E next() {

            if(!(hasNext()))throw new NoSuchElementException();
            E item = currentNode.item;
            currentNode=currentNode.next;
            return item;

        }



    }
    public static void main(String[] args) {
        myStack<String> s = new myStack<String>();
        s.push("hello");
        s.push("how");
        s.push("are");
        System.out.println(s.size);
        System.out.println(s.pop());
        s.push("you");
        System.out.println("pop: " + s.pop());
        System.out.println("size: " + s.size);

    }
}