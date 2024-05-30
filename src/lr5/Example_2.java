package lr5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example_2 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {1, 2, 3, 4, 5, 7, 22};

        System.out.println("Input: \nArray #1: " + Arrays.toString(numbers1) + "\nArray #2: " + Arrays.toString(numbers2));
        System.out.println("Output: " + Arrays.toString(FilterByCommonsElements(numbers1, numbers2)));
    }
    
    private static int[] FilterByCommonsElements(int[] left, int[] right) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        Arrays.stream(left).forEach(set1::add);
        Arrays.stream(right).forEach(set2::add);

        return set1.stream().filter(set2::contains).mapToInt(Integer::intValue).toArray(); 
    }

}
