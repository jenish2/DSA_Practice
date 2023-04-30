package Stack;

public class StackImpliLinkedList {

    static class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    static class Stack {
        Node head = null;

        public boolean isEmpty() {
            return (head == null);
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.link = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int data = head.data;
            head = head.link;
            return data;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}