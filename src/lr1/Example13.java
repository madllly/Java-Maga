package lr1;

import java.util.Scanner;

// 8. Напишите программу для вычисления суммы двух чисел. Оба числа
//вводятся пользователем. Для вычисления суммы используйте оператор +.
public class Example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Сумма: " + sum);
        scanner.close();
    }
}
