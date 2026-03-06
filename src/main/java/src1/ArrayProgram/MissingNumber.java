package src1.ArrayProgram;

import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6};

        // Calculate the missing number
        int n = numbers.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = IntStream.of(numbers).sum();
        int missingNumber = totalSum - arraySum;

        System.out.println("Missing Number: " + missingNumber);
    }
}

