package lr3;
import java.util.*;

public class Lr3Main {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Добавление элемента в начало коллекции
        System.out.println("Время выполнения операции добавления элемента в начало коллекции:");
        System.out.println("ArrayList: " + getRunningTimeAddToStart(arrayList));
        System.out.println("LinkedList: " + getRunningTimeAddToStart(linkedList));

        // Удаление элемента по индексу
        System.out.println("\nВремя выполнения операции удаления элемента по индексу:");
        System.out.println("ArrayList: " + getRunningTimeRemoveAtIndex(arrayList));
        System.out.println("LinkedList: " + getRunningTimeRemoveAtIndex(linkedList));

        // Получение элемента по индексу
        System.out.println("\nВремя выполнения операции получения элемента по индексу:");
        System.out.println("ArrayList: " + getRunningTimeGetByIndex(arrayList));
        System.out.println("LinkedList: " + getRunningTimeGetByIndex(linkedList));

        // Получение элемента из SortedSet
        System.out.println("\nВремя выполнения операции получения элемента из SortedSet:");
        System.out.println("SortedSet: " + getRunningTimeGetFromSortedSet(sortedSet));
    }

    private static long getRunningTimeAddToStart(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveAtIndex(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            list.remove(0);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeGetByIndex(List<Integer> list) {
        for (int i = 0; i < 20000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeGetFromSortedSet(SortedSet<Integer> sortedSet) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            sortedSet.add(i);
            sortedSet.contains(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}