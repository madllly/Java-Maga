package lr3;

class LinkedListt {
    Node head;

    // Ввод с головы с использованием цикла
    public void createHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Ввод с хвоста с использованием цикла
    public void createTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Вывод с использованием цикла
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString();
    }

    // Добавление элемента в начало списка
    public void addFirst(int data) {
        createHead(data);
    }

    // Добавление элемента в конец списка
    public void addLast(int data) {
        createTail(data);
    }

    // Вставка элемента в список с указанным номером
    public void insert(int index, int data) {
        if (index < 0) {
            System.out.println("Неверный индекс");
            return;
        }
        if (index == 0) {
            createHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                System.out.println("Индекс вне диапазона");
                return;
            }
            current = current.next;
        }
        if (current == null) {
            System.out.println("Индекс вне диапазона");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Удаление элемента с головы списка
    public void removeFirst() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        head = head.next;
    }

    // Удаление последнего элемента списка
    public void removeLast() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Удаление из списка элемента с указанным номером
    public void remove(int index) {
        if (index < 0) {
            System.out.println("Неверный индекс");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null || current.next == null) {
                System.out.println("Индекс вне диапазона");
                return;
            }
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Индекс вне диапазона");
            return;
        }
        current.next = current.next.next;
    }

    // Рекурсивный метод для ввода с головы
    public void createHeadRec(int data) {
        head = createHeadRec(head, data);
    }

    private Node createHeadRec(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        node.next = createHeadRec(node.next, data);
        return node;
    }

    // Рекурсивный метод для ввода с хвоста
    public void createTailRec(int data) {
        head = createTailRec(head, data);
    }

    private Node createTailRec(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        node.next = createTailRec(node.next, data);
        return node;
    }

    // Рекурсивный метод для вывода
    public String toStringRec() {
        return toStringRec(head);
    }

    private String toStringRec(Node node) {
        if (node == null) {
            return "";
        }
        return node.data + " " + toStringRec(node.next);
    }
}
