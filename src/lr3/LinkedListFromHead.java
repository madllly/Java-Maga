package lr3;

public class LinkedListFromHead {
    Node head;

    public void addToHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        LinkedListFromHead list = new LinkedListFromHead();
        list.addToHead(3);
        list.addToHead(5);
        list.addToHead(7);
    }
}