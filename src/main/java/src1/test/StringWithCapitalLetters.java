package src1.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringWithCapitalLetters {

	 public static void main(String[] args) {
	        List<String> words = Arrays.asList("hello", "World", "JAVA", "strEam", "Filter");

	        // Filter strings containing at least one uppercase letter
	        List<String> result = words.stream()
	                .filter(word -> word.chars().anyMatch(Character::isUpperCase))
	                .collect(Collectors.toList());

	        System.out.println(result);
	    }
}
