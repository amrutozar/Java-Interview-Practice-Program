package src.Program;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a Map with string keys and integer values 
		Map<String, Integer> budget = new HashMap<>(); 
		budget.put("clothes", 120);
		budget.put("grocery", 150); 
		budget.put("transportation", 100); 
		budget.put("utility", 130); 
		budget.put("rent", 1150); 
		budget.put("miscellneous", 90); 
		System.out.println("map before sorting: " + budget); 
		// let's sort this map by values first
		System.out.println("map size: " + budget.size());  // map size: 6
        
		budget.put("rent", 1150); 
		budget.put("miscellneous", 90); 
		
		System.out.println("map before sorting: " + budget); 
		// let's sort this map by values first
		System.out.println("map size: " + budget.size()); //map size: 6
		
		budget.put("rent1", 1150); 
		budget.put("miscellneous1", 90); 
		
		System.out.println("map before sorting: " + budget); 
		// let's sort this map by values first
		System.out.println("map size: " + budget.size()); //map size: 8
		
		budget.put("rent2", null); 
		budget.put("miscellneous2", null); 
		
		System.out.println("map before sorting: " + budget); 
		// let's sort this map by values first
		System.out.println("map size: " + budget.size()); // map size: 10
		
		budget.put(null, null); 
		budget.put(null, 123); 
		
		System.out.println("map before sorting: " + budget); 
		// let's sort this map by values first
		System.out.println("map size: " + budget.size());  // map size: 11
  

	}

}
