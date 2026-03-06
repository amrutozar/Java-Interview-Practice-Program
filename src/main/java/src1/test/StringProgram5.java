package src1.test;

import java.util.function.Predicate;

public class StringProgram5 {


    // Method to reverse a string using Java 8 features
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equalsIgnoreCase(reversed);  // case insensitive check
    }

    // Method to count vowels in a string using streams
    public static long countVowels(String input) {
        Predicate<Character> isVowel = c -> "AEIOUaeiou".indexOf(c) != -1;
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(isVowel)
                .count();
    }

    // Method to count consonants in a string using streams
    public static long countConsonants(String input) {
        Predicate<Character> isConsonant = c -> Character.isLetter(c) && "AEIOUaeiou".indexOf(c) == -1;
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(isConsonant)
                .count();
    }

    public static void main(String[] args) {
        String testString = "Interview";

        // Reverse the string
        System.out.println("Reversed String: " + reverseString(testString));

        // Check if the string is a palindrome
        System.out.println("Is Palindrome: " + isPalindrome(testString));

        // Count vowels and consonants
        System.out.println("Vowel Count: " + countVowels(testString));
        System.out.println("Consonant Count: " + countConsonants(testString));
    }
}
