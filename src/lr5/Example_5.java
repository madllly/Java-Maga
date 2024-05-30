package lr5;

import java.util.Arrays;
import java.util.List;


public class Example_5 {
    public static void main(String[] args) {
        List<String> tokens = Arrays.asList("Anton", "Anton1", "fkjsdbf", "abton");
        String substring = "Ant";

        System.out.println("Input: \n\tList: " + tokens + "\n\tSubstring: " + substring);
        System.out.println("Output: " + FilterBySubstring(tokens, substring));

    }
    
    private static List<String> FilterBySubstring(List<String> strings, String substring) {
        return strings.stream().filter(s -> s.contains(substring)).toList();
    }
}
