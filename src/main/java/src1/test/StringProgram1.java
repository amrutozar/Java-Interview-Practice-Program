package src1.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java language is Awesome";
		
		// count occurrence of each character in a string 
		System.out.println(" count occurrence of each character in a string  \n");
		 str.chars()
	    .mapToObj(c -> Character.valueOf((char)c)).map(Object::toString).map(String::toLowerCase)
	    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) 
	    .entrySet()
	    .stream()
	    .forEach(s -> System.out.print(s));
		 System.out.println(" count occurrence of each character in a string  \n");
		 Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) 
		    .entrySet()
		    .stream()
		    .forEach(s -> System.out.print(s));
		 
		// first non repeated character in a string 
		List<Character> charList= str.chars().mapToObj(c -> Character.valueOf((char)c)).toList();
	  Optional<Character> ch=charList.stream().filter(x-> Collections.frequency(charList, x)==1).findFirst();
	
	  System.out.println(" first non repeated character in a string "+ch);
	// last non repeated character in a string 
	  List<Character> unicCharList= charList.stream().filter(x-> Collections.frequency(charList, x)==1).toList();
	  System.out.println(" Last non repeated character in a string ="+unicCharList.get(unicCharList.size()-1));
	  //  Reverse each word of string 
	 String abc = Arrays.asList(str).stream()
			    .map(s -> new StringBuilder(s).reverse().toString())
			    .collect(Collectors.toList()).get(0);
	 System.out.println(" Reverse string ="+abc);
	 
	 String str1 = "Java language is Awesome Java language is Awesome";
		
	 System.out.println(" count occurrence of each Words in a string"); 
	List<String> arrayStr=Arrays.asList(str1.split(" "));
	Map<String,Long> map= arrayStr.stream()
	    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) ;
	System.out.println("words="+map);
	
	//Program to print most repeated character using stream api
	String name="saslldldqldldl";
	Map<String, Long> res1=name.chars().mapToObj(x->Character.valueOf((char)x)).map(Object::toString).map(String::toLowerCase)
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println("All char count="+res1);
	Entry<String, Long> res2=res1.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByValue())).findFirst().get();//.stream().forEach(x->System.out.print(x));
	System.out.println("Most repeated char="+res2);
	
	}

}
