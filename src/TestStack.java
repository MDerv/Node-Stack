/*
Dhruv Sharma
10/28/2020
11/2/2020
This is a the class that defines a stack using nodes.
 */

import java.util.*;

public class TestStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack st = new Stack(); //real stack

        //add 1st element to stacks
        st.push(2);

        //should return 2
        System.out.println(st.peek());

        //should return 1
        System.out.println(st.size());

        //add 2nd and 3rd elements to stacks
        st.push(5);
        st.push(3);

        //should return 3
        System.out.println(st.size());

        //removes last element; should return 3
        System.out.println(st.pop());

        //should return 2
        System.out.println(st.size());

        //should return 5
        System.out.println(st.peek());

        //removes last element; should return 5
        System.out.println(st.pop());

        //removes last element; should return 2
        System.out.println(st.pop());

        //should return 0
        System.out.println(st.size());

        //add 1st element to stacks (again to test if the stack could be re-used)
        st.push(7);

        //should return 7
        System.out.println(st.peek());

        //removes last element; should return 7
        System.out.println(st.pop());

        //should return 0
        System.out.println(st.size());

        //removes last element; should an error, as there are no elements in stack to remove
        System.out.println(st.pop());

    }
}
