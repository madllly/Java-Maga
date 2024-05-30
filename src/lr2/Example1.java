package lr2;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArrayWithRandomNumbers(array);
        int index_min = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index_min = i;
            }
        }
        System.out.println("Массив: "+ Arrays.toString(array));
        System.out.println("Число: "+ min + ", Индекс: " + index_min);
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }
}