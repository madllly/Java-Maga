package lr3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example6 {
    public static int ArrayListFindSurvivor(int n) {
        ArrayList<Integer> circle = new ArrayList<>();
        // Заполняем круг номерами от 1 до N
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }
        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size(); // Переходим ко второму человеку
            circle.remove(index); // Удаляем второго человека
        }
        return circle.get(0); // Остается последний выживший
    }

    public static int LinkedListFindSurvivor(int n) {
        LinkedList<Integer> circle = new LinkedList<>();
        // Заполняем круг номерами от 1 до N
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }
        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size(); // Переходим ко второму человеку
            circle.remove(index); // Удаляем второго человека
        }
        return circle.get(0); // Остается последний выживший
    }

    public static void main(String[] args) {
        int n = 100; // Пример: 10 человек в кругу
        System.out.println("Survivor is at position: " + ArrayListFindSurvivor(n));
        System.out.println("Survivor is at position: " + LinkedListFindSurvivor(n));
    }
}