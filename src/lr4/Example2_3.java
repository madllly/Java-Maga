package lr4;

import java.util.Scanner;

public class Example2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива
        System.out.println("Введите размер массива:");
        int size = 0;
        try {
            size = Integer.parseInt(scanner.nextLine());
            if (size <= 0) {
                throw new NegativeArraySizeException(
                    "Количество столбцов должно быть положительным числом."
                );
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите целое число для размера массива.");
            return;
        }

        // Ввод элементов массива и вычисление суммы
        byte sum = 0;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            try {
                byte value = Byte.parseByte(scanner.nextLine());
                sum = (byte) (sum + value); // Проверка на переполнение
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число в диапазоне byte.");
                return;
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: вычисление приведет к переполнению значения byte.");
                return;
            }
        }

        System.out.println("Сумма элементов массива типа byte: " + sum);
    }
}