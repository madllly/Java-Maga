package lr1;

import java.util.Scanner;

//10. Напишите программу, в которой Пользователь вводит два числа, а
//программой вычисляется и отображается сумма и разность этих чисел.
public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        scanner.close();
    }
}
