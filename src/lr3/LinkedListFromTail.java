package lr3;

public class LinkedListFromTail {
    Node head;
    Node tail;

    public void addToTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void main(String[] args) {
        LinkedListFromTail list = new LinkedListFromTail();
        list.addToTail(3);
        list.addToTail(5);
        list.addToTail(7);
    }
}