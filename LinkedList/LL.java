package LinkedList;

public class LL {

    Node head = null;
    int size = 0;

    public static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        size++;
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;

    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Node traversingNode = head;
        while (traversingNode != null) {
            System.out.print(traversingNode.data + " -->");
            traversingNode = traversingNode.next;
        }
        System.out.println("Null");
    }

    public void removeFirst() {

        if (head == null) {
            System.out.println("Hello!! Linked List IS Already Empty");
            return;
        }
        size--;

        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Hello!! Linked List IS Already Empty");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    public static void main(String[] args) {
        LL ll = new LL();
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addFirst("This");
        ll.addLast("Jenish");
        ll.addLast("Dholariya");

        ll.printList();

        System.out.println(ll.getSize());

        ll.removeFirst();
        ll.printList();

        ll.removeFirst();
        ll.printList();

        ll.removeLast();
        ll.printList();

        ll.removeLast();
        ll.printList();

        ll.removeLast();
        ll.removeFirst();
    }

}
