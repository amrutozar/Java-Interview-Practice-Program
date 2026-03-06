package src1.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberProgram {

	public static void main(String[] args) {
		//How do you find common elements between two arrays?
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
         
        list1.stream().filter(list2::contains).forEach(System.out::println);
        
        //Print first 10 even numbers
        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
        //First 10 odd numbers
        Stream.iterate(new int[] {1, 3}, f -> new int[] {f[1], f[1]+2})
        .limit(10)
        .map(f -> f[0])
        .forEach(i -> System.out.print(i+" "));
        
	}

}
