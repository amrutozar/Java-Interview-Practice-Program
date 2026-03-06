package src1.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringProgram3 {

	//Java 8 program to group the words by their first letter and display them in the specified format:
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("Apple", "Banana", "Pineapple", "Papaya");

        // Grouping the words by their first letter
        Map<Character, List<String>> groupedFruits = fruits.stream()
                .collect(Collectors.groupingBy(fruit -> fruit.charAt(0)));

        // Printing the output in the desired format
        groupedFruits.forEach((key, value) -> 
            System.out.println(key + " --> " + value)
        );
	}

}
