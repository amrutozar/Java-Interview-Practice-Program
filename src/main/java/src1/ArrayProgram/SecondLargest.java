package src1.ArrayProgram;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 50, 30, 40};

        // Find the second largest element
        int secondLargest = Arrays.stream(numbers)
                                  .boxed()
                                  .sorted((a, b) -> b - a)
                                  .distinct()
                                  .skip(1)
                                  .findFirst()
                                  .get();

        System.out.println("Second Largest Element: " + secondLargest);
    }
}

