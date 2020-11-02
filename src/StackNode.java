/*
Dhruv Sharma
10/28/2020
10/28/2020
This is a the class that defines a stack using nodes.
 */
public class StackNode {

    private int length;
    private TestNode firstNode;
    private TestNode lastNode;


    public StackNode() {
        firstNode = new TestNode();
        lastNode = firstNode;
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
            firstNode = ((TestNode)element);
        } else {
            peekNode().setChild((TestNode) (element));
            ((TestNode)(element)).setParent(peekNode());
        }
    }

    public T pop() { //remove and return the top element
        TestNode tempNode = peekNode();
        peekNode().getParent().setChild(null);
        return tempNode.getTData;
    }

    public int size() {
        return length;
    }

    public TestNode peekNode() { //look at the top node without removing
        TestNode tempNode = firstNode;
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
