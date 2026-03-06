package src1.ArrayProgram;

import java.util.Arrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Find sum
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum: " + sum);

        // Find average
        double average = Arrays.stream(numbers).average().getAsDouble();
        System.out.println("Average: " + average);
    }
}

