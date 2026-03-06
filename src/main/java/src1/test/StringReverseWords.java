package src1.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverseWords {

	public static void main(String[] args) {
        String input = "I Am Not String";

        List<Integer> WordsLength = Arrays.stream(input.split(" "))
               .map(word -> word.length()).toList();
        
        System.out.println(WordsLength); //[1, 2, 3, 6]
        
        String output = new StringBuilder(input).reverse().toString();
        
        System.out.println(output); // gnirtS toN mA I
        
        String reversedWords = Arrays.stream(output.split(" "))
                .collect(Collectors.joining());
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i:WordsLength)
        {
        	sb.append(reversedWords.substring(j,(i+j))+" ");
        	j=i+j;
        }
        System.out.println(sb); //g ni rtS toNmAI 
        
    }
}
