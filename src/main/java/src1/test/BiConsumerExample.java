package src1.test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample implements BiConsumer<Integer, Integer>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer, Integer> biconsumer=new BiConsumerExample();
		biconsumer.accept(1,2);
		System.out.println("==========================="); 
		BiConsumer<Integer, Integer> biconsumer1=new BiConsumer<Integer, Integer>() {
			
			@Override
			public void accept(Integer t, Integer u) {
				System.out.println("input1="+t+10+" input2="+u+10);
			}
		};
		biconsumer1.accept(3, 4);
		System.out.println("===========================");
		BiConsumer<String, Integer> biconsumer2=(a,b)->System.out.println("input1="+a+10+" input2="+b+10);
		biconsumer2.accept("abc",6);
		
		Map<String, Integer> map=new HashMap<>();
        map.put("basant",5000);
        map.put("santosh",15000);
        map.put("javed",12000);
        System.out.println("===========================");
        map.forEach(biconsumer2);
        System.out.println("===========================");
        map.forEach((a,b)->System.out.println("input1="+a+10+" input2="+b+10));
	}

	@Override
	public void accept(Integer t, Integer u) {
		System.out.println("input1="+t+" input2="+u);
		
	}

}
