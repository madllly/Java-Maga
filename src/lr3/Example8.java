package lr3;

public class Example8 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.createHead(6);
        list.createHead(10);
        list.createHead(15);

        System.out.println("Список: " + list.toString());
        list.addLast(4);
        System.out.println("Добавления элемента в конец: " + list.toString());
        list.insert(5, 2);
        System.out.println("Добавления элемента в индекс 2: " + list.toString());
        list.removeFirst();
        System.out.println("Удаления первого элемента: " + list.toString());
        list.removeLast();
        System.out.println("Удаления последнего элемента: " + list.toString());
        list.remove(1);
        System.out.println("Удаления элемента с индексом 1: " + list.toString());
        list.createHeadRec(8);
        System.out.println("Добавления элемента (рекурсия с head): " + list.toStringRec());
        list.createTailRec(8);
        System.out.println("Добавления элемента (рекурсия с tail): " + list.toStringRec());
    }
}
