package src1.StringProgram;

import java.util.function.Predicate;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String input = "JavaInterview";

        Predicate<Character> isVowel = c -> "AEIOUaeiou".indexOf(c) != -1;
        Predicate<Character> isConsonant = c -> Character.isLetter(c) && !isVowel.test(c);
        
        long vowelCount = input.chars()
                               .mapToObj(c -> (char) c)
                               .filter(isVowel)
                               .count();
        
        long consonantCount = input.chars()
                                   .mapToObj(c -> (char) c)
                                   .filter(isConsonant)
                                   .count();
        
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}
