package src1.test1;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class GreaterElementsToRight {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(56, 32, 85, 52, 49, 50);

        // Filter elements with no greater element to the right
        List<Integer> result = IntStream.range(0, numbers.size())
                .filter(i -> numbers.subList(i + 1, numbers.size()).stream()
                        .noneMatch(right -> right > numbers.get(i)))
                .mapToObj(numbers::get)
                .collect(Collectors.toList());

        System.out.println(result); // Output should be [85, 52, 50]
    }
}

