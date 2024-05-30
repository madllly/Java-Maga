package lr5;

import java.util.Arrays;
import java.util.List;

public class Example_9 {
    public static void main(String[] args) {
        List<String> tokens = Arrays.asList("Anton", "Anton1", "fkjsdbf", "abton", "a");
        System.out.println("Input: \n\tList: " + tokens);
        System.out.println("Output: " + filterByLetters(tokens));
    }

    private static List<String> filterByLetters(List<String> tokens) {
        return tokens.stream().filter(token -> token.matches("[a-zA-Z]+")).toList();
    }


}
