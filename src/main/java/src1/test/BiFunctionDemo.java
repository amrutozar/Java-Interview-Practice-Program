package src1.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class BiFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> l1=List.of(1, 3, 4, 6, 7, 9, 19);
	List<Integer> l2=List.of(11, 3, 43, 6, 7, 19);
	
	BiFunction<List<Integer>,List<Integer>,List<Integer>> bifunction=(list1,list2)->{
		return Stream.of(list1,list2).flatMap(List::stream).distinct().toList();
	};
	
	Function<List<Integer>,List<Integer>> fun=(lists)->
		 lists.stream().sorted().toList();
		 
	System.out.println("BI Function ="+ bifunction.andThen(fun).apply(l1, l2)); 
	
	 Map<String, Integer> map=new HashMap<>();
     map.put("basant",5000);
     map.put("santosh",15000);
     map.put("javed",12000);
     System.out.println(" map="+map);
     BiFunction<String,Integer,Integer> bf=new BiFunction<String, Integer, Integer>() {
		
		@Override
		public Integer apply(String t, Integer u) {
			// TODO Auto-generated method stub
			return u+1000;
		}
	};
	
	map.replaceAll(bf);
	System.out.println("adding 1000 in map="+map);
	
	 BiFunction<String,Integer,Integer> bf1=(k,v)-> v+2000;
	 
	 map.replaceAll(bf1);
	System.out.println("adding 2000 in map="+map);
	
	 map.replaceAll((k,v)-> v+3000);
	System.out.println("adding 3000 in map="+map);
	 
	}

}
