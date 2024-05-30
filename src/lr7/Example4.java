package lr7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example4 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/lr7/Example4_input.txt");
        FileWriter writer = new FileWriter("src/lr7/Example4_output.txt");
        int line = reader.read();
        while (true) {
            line = reader.read();
            if (line == -1) break;
            writer.write(line);
        }
        reader.close();
        writer.close();
    }
}
