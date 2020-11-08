/*
Dhruv Sharma
10/28/2020
11/2/2020
This is a the class that defines a stack using nodes.
 */
public class Stack<T> {

    private int length;
    private StackNode firstNode;
    private StackNode lastNode;


    public Stack() {
        lastNode = new StackNode();
//        lastNode = firstNode;
        length = 0;
    }

    public boolean isEmpty() { //checks if stack is empty
        if (length == 0) {
            return true;
        } else {
            return false;
        }
    }


    public void push(T element) { //add an element
        if (length == 0) {
            lastNode = ((StackNode)element);
        } else {
            ((StackNode)(element)).setParent(peekNode());
        }
    }

    public T pop() { //remove and return the top element
        StackNode tempNode = peekNode();
        peekNode().setParent(null);
        return tempNode.getTData();
    }

    public int size() {
        return length;
    }

    public StackNode peekNode() { //look at the top node without removing
        StackNode tempNode = firstNode;
        if (length > 1) {
            for (int i = 0; i < length - 2; i++) {
                tempNode.getChild();
            }
            return tempNode;
        } else if (length == 1) {
            return firstNode;
        } else {
            return null;
        }
    }

    public T peek() { //look at the top element without removing
        return peekNode().getTData;
    }
}
