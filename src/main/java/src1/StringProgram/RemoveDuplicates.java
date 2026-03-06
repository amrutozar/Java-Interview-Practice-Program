package src1.StringProgram;

import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "JavaInterview";

        // Remove duplicate characters using streams
        String noDuplicates = input.chars()
                                   .mapToObj(c -> (char) c)
                                   .distinct()
                                   .map(String::valueOf)
                                   .collect(Collectors.joining());

        System.out.println("String without duplicates: " + noDuplicates);
    }
}

