package lr7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) throws IOException {
        String fileName = "src/lr7/Example3.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int lineCount = 0;
        while (reader.readLine() != null) lineCount++;
        reader.close();
        System.out.println("Кол.во строк: " + lineCount);
    }
}
