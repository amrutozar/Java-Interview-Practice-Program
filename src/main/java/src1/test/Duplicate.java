package src1.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1, 11, 22 ,33 ,11, 11 ,4);
		Set<Integer> set=new HashSet();
		
		System.out.println("Print second smallet Number=");
		Integer secondSmalletNumber=list.stream().distinct().sorted().skip(1).findFirst().get();
		System.out.println(secondSmalletNumber);
		
		System.out.println("Print second Largest Number=");
		Integer secondLargestNumber=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondLargestNumber);
		
		System.out.println("Print unique Number=");
		list.stream().filter(x->set.add(x)).forEach(System.out::println);
		
		Set<Integer> set1=new HashSet();
		System.out.println("Print Duplicate Number=");
		list.stream().filter(x->!set1.add(x)).collect(Collectors.toSet()).forEach(System.out::println);
		
		int[] array1= {1,2,3,4,5};
		int[] array2= {4,5,6,7,8};
		
		List<Integer> commonNumlist=Arrays.stream(array1).filter(num->Arrays.stream(array2).anyMatch(arr2No->arr2No==num)).boxed().toList();
		System.out.println("Common Number="+commonNumlist);
		
		IntStream.range(0, array1.length/2).forEach(i->{
			int temp=array1[i];
			array1[i]=array1[array1.length-i-1];
			array1[array1.length-i-1]=temp;
		});
		System.out.println("Reverse an array of Integer In place=");
		Arrays.stream(array1).forEach(System.out::println);
		
		List<String> strList=Arrays.asList("Amrut","Vishvanath","Kanade");
		OptionalInt maxlength=strList.stream().mapToInt(str->str.length()).max();
		System.out.println("Max Length of String="+maxlength.getAsInt());
		
		String s[] = {"AB", "ABC", "BC", "BCD", "AAA", "BBB"};

		for(int i=0;i<s.length;i++)
		{
			String temp=s[i];
			if(temp.length()==3 && temp.startsWith("A"))
			{
			 System.out.println("string startWith A char="+temp);
			}
		}
		System.out.println("String Length=3 and startWith A char=");
		Arrays.stream(s).filter(str->str.length()==3 && str.startsWith("A")).forEach(System.out::println);
		
		
	}

}
