package lr3;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int[] src = new int[] {1, 2, 3, 4, 5}; 
        forRecursion(src);
	}

    private static void forRecursion(int[] numbers) {
        if (numbers.length == 0) return;
        int number = numbers[0];
        System.out.println(number);
        int sub_numbers[] = Arrays.copyOfRange(numbers, 1, numbers.length);
        forRecursion(sub_numbers);
    }
}
