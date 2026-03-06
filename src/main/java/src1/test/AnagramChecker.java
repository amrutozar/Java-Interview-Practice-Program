package src1.test;

import java.util.Arrays;

 /* Write a program to check if two given strings are anagrams of each other. 
An anagram is a word or phrase formed by rearranging the letters of another word or phrase.
example anagrams,
listen and silent */
public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert both strings to lowercase
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        // If the lengths of the strings are not equal, they can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert the strings to character arrays and sort them
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String input1 = "listen";
        String input2 = "silent";

        if (areAnagrams(input1, input2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
