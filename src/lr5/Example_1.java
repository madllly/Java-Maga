package lr5;

import java.util.Arrays;

public class Example_1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Input: " + Arrays.toString(numbers));
        System.out.println("Output: " + Arrays.toString(filterByEvenNumbers(numbers)));
    }

    private static int[] filterByEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers).filter(x -> x % 2 == 0).toArray();
    }

}
