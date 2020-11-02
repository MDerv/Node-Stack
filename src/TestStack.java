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
        StackNode sn = new StackNode(); //stack made of nodes

        //add 1st element to stacks
        st.push(2);
        sn.push(2);

        //should return 2
        System.out.println(st.peek());
        System.out.println(sn.peek());

        //should return 1
        System.out.println(st.size());
        System.out.println(sn.size());

        //add 2nd and 3rd elements to stacks
        st.push(5);
        sn.push(5);
        st.push(3);
        sn.push(3);

        //should return 3
        System.out.println(st.size());
        System.out.println(sn.size());

        //removes last element; should return 3
        System.out.println(st.pop());
        System.out.println(sn.pop());

        //should return 2
        System.out.println(st.size());
        System.out.println(sn.size());

        //should return 5
        System.out.println(st.peek());
        System.out.println(sn.peek());


    }
}
