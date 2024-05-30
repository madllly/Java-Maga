package lr5;

import java.util.Arrays;
import java.util.List;

public class Example_8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 6, 7, -1);
        int minValue = 4;
        System.out.println("Input: \n\tList: " + numbers + "\n\tMin Value: " + minValue);
        System.out.println("Output: " + filterByMinValue(numbers, minValue));
    }

    private static List<Integer> filterByMinValue(List<Integer> numbers, int minValue) {
        return numbers.stream().filter(x -> x > minValue).toList();
    }

}
