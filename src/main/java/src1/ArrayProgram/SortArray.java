package src1.ArrayProgram;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {30, 20, 50, 40, 10};

        // Sort in ascending order
        int[] ascending = Arrays.stream(numbers).sorted().toArray();
        System.out.println("Sorted in Ascending: " + Arrays.toString(ascending));

        // Sort in descending order
        int[] descending = Arrays.stream(numbers)
                                 .boxed()
                                 .sorted((a, b) -> b - a)
                                 .mapToInt(Integer::intValue)
                                 .toArray();
        System.out.println("Sorted in Descending: " + Arrays.toString(descending));
    }
}
