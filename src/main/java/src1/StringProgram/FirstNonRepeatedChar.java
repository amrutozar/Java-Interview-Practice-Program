package src1.StringProgram;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String input = "JavaInterview";

        // Find the first non-repeated character
        Character firstNonRepeated = input.chars()
                                          .mapToObj(c -> (char) c)
                                          .collect(Collectors.toMap(c -> c, c -> 1, Integer::sum, LinkedHashMap::new))
                                          .entrySet()
                                          .stream()
                                          .filter(entry -> entry.getValue() == 1)
                                          .map(Map.Entry::getKey)
                                          .findFirst()
                                          .orElse(null);
        
        System.out.println("First Non-Repeated Character: " + firstNonRepeated);
        
         // first non repeated character in a string 
     		List<Character> charList= input.chars().mapToObj(c -> (char) c).toList();
     	  Optional<Character> ch=charList.stream().filter(x-> Collections.frequency(charList, x)==1).findFirst();
     	
     	  System.out.println(" first non repeated character in a string "+ch);
    }
}

