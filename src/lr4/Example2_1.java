package lr4;
import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод размера массива
        System.out.println("Введите размер массива:");
        int size = 0;
        try {
            size = Integer.parseInt(scanner.nextLine());
            if (size <= 0) {
                throw new ArrayStoreException("Размер массива должен быть положительным числом.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите целое число для размера массива.");
            return;
        }
        
        // Ввод элементов массива
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        int positiveCount = 0;
        int sumPositive = 0;
        for (int i = 0; i < size; i++) {
            try {
                array[i] = Integer.parseInt(scanner.nextLine());
                if (array[i] > 0) {
                    positiveCount++;
                    sumPositive += array[i];
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число для элемента массива.");
                return;
            }
        }
        
        // Проверка на отсутствие положительных элементов
        if (positiveCount == 0) {
            throw new ArrayStoreException("В массиве нет положительных элементов.");
        }
        
        // Вычисление среднего значения положительных элементов
        double averagePositive = (double) sumPositive / positiveCount;
        System.out.println("Среднее значение среди положительных элементов: " + averagePositive);

        scanner.close();
    }
}