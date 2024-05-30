package lr1;

import java.util.Scanner;

//2. Напишите программу, в которой Пользователь вводит имя и возраст.
//Программа отображает сообщение об имени и возрасте пользователя.

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.println(Example7.task(name, age));
        scanner.close();
    }

    public static String task(String name, int age) {
        return ("Имя: " + name + " " + "Возраст: " + age);
    }
}
