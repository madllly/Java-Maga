package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine().toUpperCase();

        System.out.println("Введите ключ (сдвиг):");
        int key = scanner.nextInt();

        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = scanner.next();

        if (answer.equalsIgnoreCase("y")) {
            String decryptedText = encrypt(encryptedText, -key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }

        scanner.close();
    }

    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char shiftedChar = (char) ((ch - 'A' + key + 26) % 26 + 'A');
                result.append(shiftedChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}