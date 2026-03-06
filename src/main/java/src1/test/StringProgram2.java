package src1.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringProgram2 {

	public static void main(String[] args) {
		 String str = "aabbb  ccdfg";
	        List<String> dictionary = new ArrayList<>();
	        dictionary.add("aa");
	        dictionary.add("cc");

	        StringBuilder output = new StringBuilder();
	        List<String> dictionary1 = Arrays.stream(str.split("")).toList();
	        for (int i = 0; i < str.length(); i++) {
	            String currentChar = String.valueOf(str.charAt(i));
	            if (dictionary1.contains(currentChar)) {
	                output.append(currentChar);
	            }
	        }

	        System.out.println(output.toString());

	}

}
