package lr5;

import java.util.Arrays;
import java.util.List;
import java.lang.Math;


public class Example_4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 6);

        System.out.println("Input: " + numbers);
        System.out.println("Output: " + toSquare(numbers));

    }
    
    private static List<Integer> toSquare(List<Integer> numbers) {
        return numbers.stream().map(number -> (int) Math.pow(number, 2)).toList();
    }

}
