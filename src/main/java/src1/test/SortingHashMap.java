package src1.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortingHashMap {

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
		Map<String, Integer> sorted = budget .entrySet() .stream() .sorted( Entry.comparingByValue())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println("map after sorting by values: " + sorted); 
		
		// above code can be cleaned a bit by using method reference 
		sorted = budget .entrySet() .stream() .sorted( Entry.comparingByValue())
				.collect( Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		// now let's sort the map in decreasing order of value 
		sorted = budget .entrySet() .stream() .sorted(Collections.reverseOrder(Entry.comparingByValue()))
				.collect( Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println("map after sorting by values in descending order: " + sorted);
		
		   System.out.println("map after sorting by values using comparingByValue " );
		  //Returns a Set view of the mappings contained in this map    
		budget.entrySet()  
	     //Returns a sequential Stream with this collection as its source  
	     .stream()  
	     //Sorted according to the provided Comparator  
	     .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
	     //Performs an action for each element of this stream  
	     .forEach(System.out::println);  
		
		List<Entry<String, Integer>> ll=budget.entrySet()
                                          //Returns a sequential Stream with this collection as its source
                                          .stream()
                                          //Sorted according to the provided Comparator
                                          .sorted(Entry.comparingByValue(Comparator.reverseOrder())).toList();
		
		System.out.println("Linked list="+ll);
		
		System.out.println("map after sorting by Key using treemap " );
		// TreeMap to store values of HashMap
        TreeMap<String, Integer> sortedmap = new TreeMap<>();
 
        // Copy all data from hashMap into TreeMap
        sortedmap.putAll(budget);
        
        // Display the TreeMap which is naturally sorted based on key
        for (Entry<String, Integer> entry : sortedmap.entrySet())
            System.out.println("Key = " + entry.getKey() +
                         ", Value = " + entry.getValue()); 

	}

}
