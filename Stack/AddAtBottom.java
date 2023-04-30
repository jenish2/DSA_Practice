package Stack;

import java.util.*;

public class AddAtBottom {

    public static void addAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int element = s.pop();
        addAtBottom(s, data);
        s.push(element);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        addAtBottom(s,5);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
