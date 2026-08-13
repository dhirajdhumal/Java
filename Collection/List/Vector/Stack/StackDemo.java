package List.Vector.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(23);
        stack.add(25);
        stack.add(26);
        stack.add(27);

        //Additionally, we can use push() method to add elements to the stack
        stack.push(28);//push() method adds an element to the top of the stack
        System.out.println(stack.peek()); //peek() method returns the top element of the stack without removing it
        System.out.println(stack.pop()); //pop() method removes and returns the top element of the stack
        System.out.println(stack);
    }
}
