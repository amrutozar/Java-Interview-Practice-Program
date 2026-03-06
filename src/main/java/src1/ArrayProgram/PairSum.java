package src1.ArrayProgram;

import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
        int targetSum = 10;

        // Find pairs that sum to the target value
        Arrays.stream(numbers)
              .forEach(num -> Arrays.stream(numbers)
                                    .filter(otherNum -> num + otherNum == targetSum && num != otherNum)
                                    .forEach(otherNum -> System.out.println(num + ", " + otherNum)));
    }
}

