package lr7;

import java.io.File;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        String path = "src/lr7";
        Scanner in = new Scanner(System.in);
        System.out.print("Название файла: ");
        String fileName = in.nextLine();
        String finalFileName = path + File.separator + fileName;
        File file = new File(finalFileName);
        if (file.exists()) {
            long fileSize = file.length();
            System.out.println("Размер файла " + fileName + " составляет " + fileSize + " байт.");
        } else {
            System.out.println("Файл не найден.");
        }
        in.close();
    }
}
