package lr3;

import java.util.*;

public class Example10 {

    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Добавление в начало:");
        System.out.println("ArrayList: " + AddToFirst(arrayList));
        System.out.println("ArrayDeque: " + AddToFirst(arrayDeque));
        System.out.println("TreeMap: -");


        System.out.println("Добавление в середину:");
        System.out.println("ArrayList: " + AddToMiddle(arrayList));
        System.out.println("ArrayDeque: -");
        System.out.println("TreeMap: -");

        System.out.println("Добавление в конец:");
        System.out.println("ArrayList: " + AddToEnd(arrayList));
        System.out.println("ArrayDeque: " + AddToEnd(arrayDeque));
        System.out.println("TreeMap: " + AddToEnd(treeMap));


        System.out.println("Удаление в начале:");
        System.out.println("ArrayList: " + removeToFirst(arrayList));
        System.out.println("ArrayDeque: " + removeToFirst(arrayDeque));
        System.out.println("TreeMap: " + removeToFirst(treeMap));

        System.out.println("Удаление в середине:");
        System.out.println("ArrayList:" + removeToMiddle(arrayList));
        System.out.println("ArrayDeque: -");
        System.out.println("TreeMap: -");


        System.out.println("Удаление в конце:");
        System.out.println("ArrayList: " + removeToEnd(arrayList));
        System.out.println("ArrayDeque: " + removeToEnd(arrayDeque));
        System.out.println("TreeMap: -");


        System.out.println("Получение по индексу:");
        System.out.println("ArrayList: " + getByIndex(arrayList));
        System.out.println("ArrayDeque: -");
        System.out.println("TreeMap: -");


    }

    private static long getByIndex(ArrayList<Integer> arrayList){
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayList.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    private static long removeToFirst(ArrayList<Integer> arrayList){
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayList.remove(0);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeToMiddle(ArrayList<Integer> arrayList){
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1000000-2; i++) {
            arrayList.remove((int) (arrayList.size() / 2));
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    private static long removeToEnd(ArrayDeque<Integer> arrayDeque){
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayDeque.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayDeque.pop();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeToEnd(ArrayList<Integer> arrayList){
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeToFirst(ArrayDeque<Integer> arrayDeque){
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayDeque.add(i);
        }
        
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayDeque.remove();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeToFirst(TreeMap<Integer, Integer> treeMap){
        for (int i = 0; i < 1 * 1000000; i++) {
            treeMap.put(i, i);
        }
        
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1000000; i++) {
            treeMap.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    private static long AddToFirst(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayList.add(0, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long AddToFirst(ArrayDeque<Integer> arrayDeque){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayDeque.addFirst(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    private static long AddToEnd(ArrayDeque<Integer> arrayDeque){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayDeque.addLast(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long AddToEnd(ArrayList<Integer> arrayList){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long AddToEnd(TreeMap<Integer, Integer> treeMap){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1000000; i++) {
            treeMap.put(i, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    private static long AddToMiddle(ArrayList<Integer> arrayList){
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1000000; i++) {
            arrayList.add(1000000, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

}
