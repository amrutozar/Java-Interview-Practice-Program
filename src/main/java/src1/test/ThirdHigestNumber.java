package src1.test;

import java.util.Comparator;
import java.util.stream.IntStream;

public class ThirdHigestNumber {

	public static void main(String[] args) {

		int[] nos= {1,2,5,7,4,8};
		int thirdlarge=IntStream.of(nos).boxed().sorted(Comparator.reverseOrder()).toList().get(2);
		System.out.println("third large="+thirdlarge);
	}

}
