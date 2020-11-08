/*
Dhruv Sharma
10/28/2020
11/2/2020
This is a the class that defines a stack using nodes.
 */
public class Stack<T> {

    private int length;
    private StackNode lastNode;


    public Stack() {
        lastNode = new StackNode();
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
            StackNode tempNode = new StackNode(element);
            lastNode = tempNode;
            length++;
        } else {
            StackNode tempNode = new StackNode(element, peekNode());
            lastNode = tempNode;
            length++;
        }
    }

    public T pop() { //remove and return the top element
        StackNode tempNode = peekNode();

        if(length > 1) {
            lastNode = peekNode().getParent();
            tempNode.setParent(null);
            length--;
            return (T) tempNode.getTData();
        }
        else if(length == 1) {
            lastNode = new StackNode();
            length--;
            return (T) tempNode.getTData();
        }
        else {
            throw new IndexOutOfBoundsException("Your stack is empty!");
        }
    }

    public int size() {
        return length;
    }

    public StackNode peekNode() { //look at the top node without removing
        return lastNode;
    }

    public T peek() { //look at the top element without removing
        return (T) peekNode().getTData();
    }
}
