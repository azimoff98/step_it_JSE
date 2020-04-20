package az.stepit.jcf;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.peek();
        System.out.println("pop: " + stack.pop());
        System.out.println("stack after pop: " + stack);

    }
}
