package src1.StringProgram;

import java.util.stream.Collectors;

public class SortCharacters {
    public static void main(String[] args) {
        String input = "JavaInterview";
        
        // Sort the characters in the string
        String sorted = input.chars()
                             .mapToObj(c -> (char) c)
                             .sorted()
                             .map(String::valueOf)
                             .collect(Collectors.joining());

        System.out.println("Sorted Characters: " + sorted);
    }
}

