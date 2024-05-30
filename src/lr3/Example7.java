package lr3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        inputArrayElements(array, 0, scanner);

        System.out.println("Введенный массив:");
        outputArrayElements(array, 0);

        scanner.close();
    }

    public static void inputArrayElements(int[] array, int index, Scanner scanner) {
        if (index < array.length) {
            array[index] = scanner.nextInt();
            inputArrayElements(array, index + 1, scanner);
        }
    }

    public static void outputArrayElements(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            outputArrayElements(array, index + 1);
        }
    }
}
