package lr1;

import java.util.Calendar;
import java.util.Scanner;

// 7. Напишите программу, в которой по возрасту определяется год рождения.
public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.println("Год рождения: " + getBirthYear(age));
        scanner.close();
    }

    private static int getBirthYear(int age) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - age;
    }
}
