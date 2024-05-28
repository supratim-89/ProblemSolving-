package stack;

import java.util.Stack;

public class StackInitial {
    public static void main(String[] args) {
        Stack<Integer>  myStack=new Stack<>();
        myStack.push(5);myStack.push(8);myStack.push(9);
        System.out.println(myStack+"The size is ::"+myStack.size());
        System.out.println(myStack+"The peeked ::"+myStack.peek());

    }
}
