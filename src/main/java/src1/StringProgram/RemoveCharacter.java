package src1.StringProgram;

import java.util.stream.Collectors;

public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "JavaInterview";
        char remove = 'a';

        // Remove a specific character
        String result = input.chars()
                             .mapToObj(c -> (char) c)
                             .filter(c -> c != remove)
                             .map(String::valueOf)
                             .collect(Collectors.joining());

        System.out.println("String after removing '" + remove + "': " + result);
    }
}

