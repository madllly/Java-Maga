package lr5;

import java.util.Arrays;
import java.util.List;

public class Example_7 {
    public static void main(String[] args) {
        List<String> tokens = Arrays.asList("Anton", "Anton1", "fkjsdbf", "abton", "a");
        int minLength = 5;


        System.out.println("Input: \n\tList: " + tokens + "\n\tMin Length: " + minLength);
        System.out.println("Output: " + filterByLength(tokens, minLength));
    }

    private static List<String> filterByLength(List<String> tokens, int minLength) {
        return tokens.stream().filter(token -> token.length() >= minLength).toList();
    }
}
