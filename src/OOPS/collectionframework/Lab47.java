package src.OOPS.collectionframework;

import java.util.Stack;

public class Lab47 {
    public static void main(String[] args) {
        Stack stack=new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("V");
        stack.push("K");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
