package src1.StringProgram;

import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java programming language is powerful";
        
        // Find the longest word
        String longestWord = Arrays.stream(sentence.split(" "))
                                   .max((word1, word2) -> word1.length() - word2.length())
                                   .orElse(null);
        
        System.out.println("Longest word: " + longestWord);
    }
}

