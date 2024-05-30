package lr1;

import java.util.Scanner;

//9. Напишите программу, в которой пользователь вводит число, а программой
//отображается последовательность из четырех чисел: число, на единицу
//меньше введённого, введенное число и число, на единицу больше введенного.
//Четвертое число должно быть квадратом суммы первых трех чисел.
public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int previousNumber = number - 1;
        int nextNumber = number + 1;
        int fourthNumber = (number + previousNumber + nextNumber) * (number + previousNumber + nextNumber);

        System.out.println("Последовательность чисел: " + previousNumber + ", " + number + ", " + nextNumber + ", " + fourthNumber);
        scanner.close();
    }
}
