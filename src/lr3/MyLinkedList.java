package lr3;

public class MyLinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void createHead(int data) {
        this.head = new Node(data, head);
    }

    public void createTail(int data) {
        Node newElement = new Node(data, null);
        if (this.head == null) {
            this.head = newElement;
        } else {
            Node current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newElement);
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = this.head;
        while (current != null) {
            result.append(current.getValue()).append(" ");
            current = current.getNext();
        }
        return result.toString();
    }

    public void addFirst(int data) {
        createHead(data);
    }

    public void addLast(int data) {
        createTail(data);
    }

    public void insert(int data, int index) {
        Node newElement = new Node(data, null);
        if (this.head == null) {
            createHead(data);
        } else {
            Node current = this.head;
            int k = 1;
            while (current.getNext() != null && (k < index)) {
                current = current.getNext();
                k++;
            }
            newElement.setNext(current.getNext());
            current.setNext(newElement);
        }
    }

    public void removeFirst() {
        if (head != null) {
            this.head = head.getNext();
        }
    }

    public void removeLast() {
        if (this.head == null || this.head.getNext() == null) {
            this.head = null;
            return;
        }
        Node current = this.head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return; 
        }
        Node current = this.head;
        int iter = 1;
        while (current.getNext() != null && (iter < index)) {
            current = current.getNext();
            iter++;
        }
        current.setNext(current.getNext().getNext());
    }

    public void createHeadRec(int data) {
        this.head = createHeadRecHelper(this.head, data);
    }

    private Node createHeadRecHelper(Node node, int data) {
        if (node == null) {
            return new Node(data, null);
        }
        node.setNext(createHeadRecHelper(node.getNext(), data));
        return node;
    }

    public void createTailRec(int data) {
        this.head = createTailRecHelper(this.head, data);
    }

    private Node createTailRecHelper(Node node, int data) {
        if (node == null) {
            return new Node(data, null);
        }
        node.setNext(createTailRecHelper(node.getNext(), data));
        return node;
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node node) {
        if (node == null) return "";
        return node.getValue() + " " + toStringRecHelper(node.getNext());
    }
}
