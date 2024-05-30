package lr4;
import java.util.Scanner;

public class Example2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод размерности матрицы
        System.out.println("Введите количество строк матрицы:");
        int rows = 0;
        try {
            rows = Integer.parseInt(scanner.nextLine());
            if (rows <= 0) {
                throw new NegativeArraySizeException(
                    "Количество строк должно быть положительным числом."
                );
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите целое число для количества строк.");
            return;
        }
        
        System.out.println("Введите количество столбцов матрицы:");
        int cols = 0;
        try {
            cols = Integer.parseInt(scanner.nextLine());
            if (cols <= 0) {
                throw new NegativeArraySizeException(
                    "Количество столбцов должно быть положительным числом."
                );
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите целое число для количества столбцов.");
            return;
        }
        
        // Создание матрицы
        int[][] matrix = new int[rows][cols];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                try {
                    matrix[i][j] = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите целое число для элемента матрицы.");
                    return;
                }
            }
        }
        
        // Ввод номера столбца
        System.out.println("Введите номер столбца, который хотите вывести:");
        int columnNumber = 0;
        try {
            columnNumber = Integer.parseInt(scanner.nextLine());
            if (columnNumber < 1 || columnNumber > cols) {
                throw new ArrayIndexOutOfBoundsException(
                    "Ошибка: введен недопустимый номер столбца."
                );
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите целое число для номера столбца.");
            return;
        }
        
        // Вывод столбца
        System.out.println("Столбец с номером " + columnNumber + ":");
        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][columnNumber - 1]);
        }
    }
}