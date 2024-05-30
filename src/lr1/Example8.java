package lr1;

import java.util.Scanner;

//3. Напишите программу, в которой Пользователь последовательно вводит
//название текущего дня недели, название месяца и дату (номер дня в месяце).
//Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String dayOfWeek = scanner.nextLine();

        System.out.print("Введите месяц: ");
        String month = scanner.nextLine();

        System.out.print("Введите дату: ");
        int date = scanner.nextInt();

        task(dayOfWeek, date, month);
        scanner.close();
    }

    private static void task(String dayOfWeek, int date, String month) {
        System.out.println("Сегодняшняя дата: "+ dayOfWeek +", "+ date +" "+ month);
    }
}
