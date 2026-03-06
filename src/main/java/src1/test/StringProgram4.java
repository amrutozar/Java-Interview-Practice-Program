package src1.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringProgram4 {

	// Java 8 program that sorts a list of strings based on their length:
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> fruits = Arrays.asList("Apple", "Banana", "Pineapple", "Papaya");

	        // Sorting the list based on the size of the string
	        List<String> sortedFruits = fruits.stream()
	                .sorted(Comparator.comparingInt(String::length))
	                .collect(Collectors.toList());

	        // Printing the sorted list
	        System.out.println(sortedFruits);

	}

}
