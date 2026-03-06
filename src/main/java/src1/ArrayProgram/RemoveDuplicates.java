package src1.ArrayProgram;
import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 10, 40, 50};

        // Remove duplicates
        int[] uniqueNumbers = IntStream.of(numbers)
                                       .distinct()
                                       .toArray();

        System.out.println("Array without duplicates: " + Arrays.toString(uniqueNumbers));
    }
}

