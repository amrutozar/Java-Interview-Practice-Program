package src1.StringProgram;

import java.util.Map;
import java.util.stream.Collectors;

public class CharOccurrence {
    public static void main(String[] args) {
        String input = "JavaInterview";

        // Count occurrences of each character using Java 8 streams
        Map<Character, Long> charCountMap = input.chars()
                                                 .mapToObj(c -> (char) c)
                                                 .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        
        charCountMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
