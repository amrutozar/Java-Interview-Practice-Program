package src1.StringProgram;

import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        // Check if the two strings are anagrams
        boolean isAnagram = str1.chars().sorted().boxed().toList()
                            .equals(str2.chars().sorted().boxed().collect(Collectors.toList()));

        System.out.println("Are anagrams: " + isAnagram);
    }
}
