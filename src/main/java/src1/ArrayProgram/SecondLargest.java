package src1.ArrayProgram;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 50, 30, 40};

        // Find the second largest element
   int secondLargest = Arrays.stream(numbers)
                             .boxed()
                             .sorted((a, b) -> b.compareTo(a))
                             .distinct()
                             .skip(1)
                             .findFirst()
                             .orElse(-1);

        System.out.println("Second Largest Element: " + secondLargest);
    }
}

