package src1.test1;

import java.util.Arrays;
import java.util.List;

public class SumEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sum even numbers without using sum() method
        int evenSum = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .reduce(0, (subtotal, element) -> subtotal + element); // Accumulate the sum
        System.out.println("Sum of even numbers: " + evenSum);
     // Sum even numbers  using sum() method
        int evenSum1 = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers: " + evenSum1);
    }
}

