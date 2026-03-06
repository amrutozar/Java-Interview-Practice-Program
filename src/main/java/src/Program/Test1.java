package src.Program;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
//Program to print most repeated character using stream api
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="saslldldqldldl";
		Map<String, Long> res1=name.chars().mapToObj(x->Character.valueOf((char)x)).map(Object::toString).map(String::toLowerCase)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("res1="+res1);
	    Entry<String, Long> res2=res1.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByValue())).findFirst().get();//.stream().forEach(x->System.out.print(x));
		System.out.println("res2="+res2);
	}

}
