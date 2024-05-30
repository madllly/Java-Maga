package lr1;

import java.util.Scanner;

//4. Напишите программу, в которой пользователю предлагается ввести
//название месяца и количество дней в этом месяце. Программа выводит
//сообщение о том, что соответствующий месяц содержит указанное количество
//дней.

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();

        System.out.print("Введите количество дней в этом месяце: ");
        int days = scanner.nextInt();

        System.out.println(task(month, days));
        scanner.close();
    }

    private static String task(String month, int days) {
        return "Месяц " + month + " содержит " + days + " дней.";
    }
}
