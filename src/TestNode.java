/*
Dhruv Sharma
9/30/2020
10/4/2020
This is a simple node class
*/

public class TestNode<T> {

    private TestNode parentNode;
    private TestNode childNode;
    private T tData;

    public TestNode() {
        //empty
    }

    public TestNode(T data) { // 1 param
        tData = data;
        parentNode = null;
        childNode = null;
    }

    public TestNode(T data, TestNode parent, TestNode child) { // 3 param
        tData = data;
        parentNode = parent;
        childNode = child;
    }

    public TestNode getParent () { //returns parentNode instance variable
        return parentNode;
    }

    public TestNode getChild () { //returns childNode instance variable
        return childNode;
    }

    public T getTData() { //returns tData instance variable
        return tData;
    }

    public void newParent(TestNode parent) { //overwrites parentNode instance variable
        parentNode =  parent;
    }

    public void newChild(TestNode child) { //overwrites childNode instance variable
        childNode =  child;
    }

    public void newTData(T data) { //overwrites tData instance variable
        tData =  data;
    }

    public String toString() { //outputs tData as a string
        return "Node: " + tData.toString();
    }

    public boolean equals(TestNode nodeToCompare) { //compares tData instance variable to another class' tData instance variable
        return tData == nodeToCompare.getTData();
    }

}