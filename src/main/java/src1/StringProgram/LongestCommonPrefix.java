package src1.StringProgram;

import java.util.Arrays;
import java.util.Optional;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String[] strs2 = {"hello", "world"};

        System.out.println(findLongestCommonPrefix(strs1)); // Output: "gee"
        System.out.println(findLongestCommonPrefix(strs2)); // Output: "-1"
    }

    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "-1";

        // Find the shortest string in the array
        Optional<String> shortestStr = Arrays.stream(strs)
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        if (!shortestStr.isPresent()) return "-1";

        String prefix = shortestStr.get();

        for (int i = 0; i < prefix.length(); i++) {
            char currentChar = prefix.charAt(i);
            // Check if this character is present at the same position in all strings
            final int j=i;
            boolean isCommon = Arrays.stream(strs)
                    .allMatch(s -> s.charAt(j) == currentChar);

            if (!isCommon) {
                // Return the common prefix up to this point
                return prefix.substring(0, i).isEmpty() ? "-1" : prefix.substring(0, i);
            }
        }

        return prefix.isEmpty() ? "-1" : prefix;
    }
}

