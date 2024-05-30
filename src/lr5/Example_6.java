package lr5;

import java.util.Arrays;
import java.util.List;


public class Example_6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 12);
        int divisor = 2;
        System.out.println("Input: \n\tList: " + numbers + "\n\tDivisor: " + divisor);
        System.out.println("Output: " + filterByDivisor(numbers, divisor));
    }

    private static List<Integer> filterByDivisor(List<Integer> numbers, int divisor) {
        return numbers.stream().filter(x -> x % divisor == 0).toList();
    }

}
