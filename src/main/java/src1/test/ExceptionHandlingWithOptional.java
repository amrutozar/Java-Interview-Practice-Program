package src1.test;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExceptionHandlingWithOptional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 106);

  /*      List<Integer> resultList = numbers.stream()
                .map(number -> someOperation(number)
                        .exceptionally(ex -> {
                            System.err.println("Exception: " + ex.getMessage());
                            return -1; // Default value in case of an exception
                        })
                        .orElse(-1) // Default value in case of an exception
                )
                .collect(Collectors.toList());
 
        System.out.println("Result List: " + resultList); */
    }

    // Example method that may throw an exception
    private static Optional<Integer> someOperation(int number) {
        if (number % 2 == 0) {
            return Optional.of(number * 2);
        } else {
            return Optional.empty();
        }
    }
}

