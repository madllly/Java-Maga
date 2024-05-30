package lr3;

public class Example7 {
    public static void byHead() {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n0.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);

        Node node = n0;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    public static void byTail() {
        Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }

        Node node = head;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }


    public static void main(String[] args) {
        byHead();
        byTail();
    }
}