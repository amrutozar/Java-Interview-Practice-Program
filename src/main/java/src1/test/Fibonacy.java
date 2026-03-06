package src1.test;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonacy Example");
Stream.iterate(new int[] {0,1}, t->new int[] {t[1],t[0]+t[1]})
      .limit(10)
      .map(t->t[0])
      .forEach(x->System.out.print(" "+x));
   System.out.println("\nprint 1 to 10 number Example");
   Stream.iterate(1,n->n+1).limit(10).forEach(x->System.out.print(" "+x));
	System.out.println("\n Stream.genetare random number Example");
	Stream.generate(()->(new Random()).nextInt(100)).limit(10).forEach(x->System.out.print(" "+x));
	System.out.println("\n Stream.takewhile Example short cuiruit");
	
	Stream.generate(()->(new Random()).nextInt(100)).takeWhile(n->n<=50).forEach(x->System.out.print(" "+x));
	
	System.out.println("\n Stream.range Example ");

	IntStream.range(1, 10).forEach(x->System.out.print(" "+x));
	System.out.println("\nStream.closed range Example ");
	IntStream.rangeClosed(1, 10).forEach(x->System.out.print(" "+x));
	System.out.println("\nStream.closed range Example 2 ");
	IntStream.rangeClosed(1, 10).map(i->i*i).forEach(x->System.out.print(" "+x));
	}
}
