package src1.test;

import java.util.Map;
import java.util.stream.Collectors;

public class StringCompress {
	    public static void main(String[] args) {
	        String input = "AAABBBBCCA";
	        String compressedString = compressString(input);
	        System.out.println(compressedString);
	        
	        String compressStringUsingJava8 = compressStringUsingJava8(input);
	        System.out.println("compressStringUsingJava8="+compressStringUsingJava8);
	    }

	    public static String compressString(String input) {
	        StringBuilder compressed = new StringBuilder();
	        int count = 1;

	        for (int i = 0; i < input.length() - 1; i++) {
	            if (input.charAt(i) == input.charAt(i + 1)) {
	                count++;
	            } else {
	                compressed.append(count);
	                compressed.append(input.charAt(i));
	                count = 1;
	            }
	        }
	        
	        // Append the count and the last character
	        compressed.append(count);
	        compressed.append(input.charAt(input.length() - 1));

	        return compressed.toString();
	    }
	    
	    public static String compressStringUsingJava8(String input) {
	        Map<Character, Long> charCounts = input.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

	        StringBuilder compressed = new StringBuilder();
	        charCounts.forEach((c, count) -> compressed.append(count).append(c));

	        return compressed.toString();
	    }

}
