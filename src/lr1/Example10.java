package lr1;

import java.util.Calendar;
import java.util.Scanner;

//5. Напишите программу, в которой по году рождения определяется возраст
//пользователя.
public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год рождения: ");
        int birthYear = scanner.nextInt();

        System.out.println("Ваш возраст: " + getAge(birthYear));
        scanner.close();
    }

    public static int getAge(int birthYear) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;
        return age;
    }
}
