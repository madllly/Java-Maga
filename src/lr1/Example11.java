package lr1;

import java.util.Scanner;

//6. Напишите программу, в которой Пользователь вводит имя и год рождения,
//в программа отображает сообщение содержащее имя пользователя и его
//возраст.
public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите год рождения: ");
        int year = scanner.nextInt();

        System.out.println(Example7.task(name, Example10.getAge(year)));
        scanner.close();
    }
}
