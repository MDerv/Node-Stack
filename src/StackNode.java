/*
Dhruv Sharma
9/30/2020
10/4/2020
This is a simple node class
*/

public class StackNode<T> {

    private StackNode parentNode;
    private T tData;

    public StackNode() {
        //empty
    }

    public StackNode(T data) { // 1 param
        tData = data;
        parentNode = null;
    }

    public StackNode(T data, StackNode parent) { // 2 param
        tData = data;
        parentNode = parent;
    }

    public StackNode getParent () { //returns parentNode instance variable
        return parentNode;
    }

    public T getTData() { //returns tData instance variable
        return tData;
    }

    public void newParent(StackNode parent) { //overwrites parentNode instance variable
        parentNode =  parent;
    }

    public void setParent(StackNode parent) { //overwrites parentNode instance variable
        parentNode = parent;
    }

    public void newTData(T data) { //overwrites tData instance variable
        tData =  data;
    }

    public String toString() { //outputs tData as a string
        return "Node: " + tData.toString();
    }

    public boolean equals(StackNode nodeToCompare) { //compares tData instance variable to another class' tData instance variable
        return tData == nodeToCompare.getTData();
    }

}