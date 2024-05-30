package lr5;

import java.util.Arrays;
import java.util.List;

public class Example_3 {
    public static void main(String[] args) {
        List<String> tokens = Arrays.asList("vadim", "Anton", "Mochalov");

        System.out.println("Input: " + tokens);
        System.out.println("Output: " + filterByOnlyUpperCase(tokens));
    }
    
    private static List<String> filterByOnlyUpperCase(List<String> tokens) {
        return tokens.stream().filter(token -> Character.isUpperCase(token.charAt(0))).toList(); 
    }

}
