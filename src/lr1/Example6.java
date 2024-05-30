package lr1;

import java.util.Scanner;

//1. Напишите программу, в которой Пользователь вводит сначала фамилию,
//        затем имя, затем отчество. После ввода программа выводит сообщение «Hello
//        <фамилия, имя, отчество>».
public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();

        System.out.print("Введите имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = scanner.nextLine();

        System.out.println(Example6.task(lastName, firstName, middleName));
        scanner.close();
    }

    public static String task(String lastName, String firstName, String middleName) {
        return "Hello " + lastName + " " + firstName + " " + middleName;
    }
}
