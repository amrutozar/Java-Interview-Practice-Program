package src1.test;

import java.util.HashSet;
import java.util.Optional;

public class StringFirstRepeatedCharacter {

	public static void main(String[] args) {
        String input = "swiss";

        // Find the first repeated character
        Optional<Character> firstRepeated = input.chars()
                .mapToObj(c -> (char) c)
                .filter(new HashSet<>()::add)
                .findFirst();

        // Print the result
        System.out.println("First repeated character: " +
                firstRepeated.orElse(null));
    }
}
