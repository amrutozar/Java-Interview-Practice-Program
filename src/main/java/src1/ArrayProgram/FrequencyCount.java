package src1.ArrayProgram;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 5, 5};

        // Count frequency of each element
        Map<Integer, Long> frequencyMap = Arrays.stream(numbers)
                                                .boxed()
                                                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));

        frequencyMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}

