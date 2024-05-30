package lr5;

import java.util.Arrays;
import java.util.List;

public class Example_10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-45, 45, -435, 543, 123, -34, 0, 1);
        int maxValue = 67;
        System.out.println("Input: \n\tList: " + numbers + "\n\tMax Value: " + maxValue);
        System.out.println("Output: " + filterByMaxValue(numbers, maxValue));
    }

    private static List<Integer> filterByMaxValue(List<Integer> numbers, int maxValue) {
        return numbers.stream().filter(x -> x < maxValue).toList();
    }
}
