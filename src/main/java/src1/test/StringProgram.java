package src1.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringProgram {

	public static void main(String[] args) {
		List<String> listOfString = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        
        listOfString.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	//How do you find the most repeated element in an array?
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        
        Map<String, Long> elementCountMap = listOfStrings.stream()
                                                         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         
        Entry<String, Long> mostFrequentElement = elementCountMap.entrySet().stream().max(Entry.comparingByValue()).get();
         
        System.out.println("Most Frequent Element : "+mostFrequentElement.getKey());
         
        System.out.println("Count : "+mostFrequentElement.getValue());
        
        //Given a list of strings, find out those strings which start with a number?
        
        List<String> listOfString1 = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        
        listOfString1.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);
    
        //Print duplicate characters in a string?
        
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        
        Set<String> uniqueChars = new HashSet<>();
         
        Set<String> duplicateChars = 
                Arrays.stream(inputString.split(""))
                        .filter(ch -> ! uniqueChars.add(ch))
                        .collect(Collectors.toSet());
         
        System.out.println("duplicateChars="+duplicateChars);
        
        //Find first repeated character in a string?

        String inputString1 = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        
        Map<String, Long> charCountMap = 
                            Arrays.stream(inputString1.split(""))
                                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
         
        String firstRepeatedChar = charCountMap.entrySet()
                                                .stream()
                                                .filter(entry -> entry.getValue() > 1)
                                                .map(entry -> entry.getKey())
                                                .findFirst()
                                                .get();
         
        System.out.println(firstRepeatedChar);
        
        //How to find only duplicate elements with its count from the String ArrayList in Java8?
        
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names
                                     .stream()
                         .filter(x->Collections.frequency(names, x)>1)
                         .collect(Collectors.groupingBy
                         (Function.identity(), Collectors.counting()));
        System.out.println(namesCount);

	}

}
