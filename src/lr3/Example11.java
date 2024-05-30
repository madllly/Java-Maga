package lr3;

import java.util.LinkedList;

public class Example11 {
    public static int findSurvivor(int n, int k) {
        LinkedList<Integer> people = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + k - 1) % people.size();
            people.remove(index);
        }

        return people.get(0);
    }

    public static void main(String[] args) {
        int n = 10; // количество человек в круге
        int k = 3; // шаг, через который убирают человека

        int survivor = findSurvivor(n, k);
        System.out.println("Последний выживший: " + survivor);
    }
}
