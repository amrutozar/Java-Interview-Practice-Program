package src1.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FactorialAndPrime {

	public static void main(String[] args) {

		int factNo=5;
		
		int factorial =IntStream.rangeClosed(2, factNo).reduce(1, (x,y)->x*y);
		System.out.println("Factorial="+factorial);
		
		int sum = IntStream.rangeClosed(1, factNo).reduce(0, (a, b) -> a+b);
		System.out.println("sum="+sum);
		
		int no=7;
		System.out.println(no+" is prime or not="+isPrime(no));
		
	List<Double> sqrList=Stream.iterate(1,i->i+1).filter(n->isPrime(n)).map(Math::sqrt).limit(5).collect(Collectors.toList());
	System.out.println("square offirst 5 prime no="+sqrList);
	}
	
	public static boolean isPrime(int no)
	{
		return no>1 && IntStream.range(2, no).noneMatch(n->no%n==0);
		
	}

}
