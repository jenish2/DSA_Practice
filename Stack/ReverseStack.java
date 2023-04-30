package Stack;

import java.util.*;;

public class ReverseStack {
    public static void pushAtEnd(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int element = stack.pop();
        pushAtEnd(stack, data);
        stack.push(element);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int data = stack.pop();
        reverseStack(stack);
        pushAtEnd(stack, data);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        reverseStack(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
