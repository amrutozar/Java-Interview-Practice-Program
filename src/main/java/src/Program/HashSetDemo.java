package src.Program;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// a HashSet with string  values 
		HashSet budget = new HashSet(); 
		budget.add("clothes");
		budget.add("grocery"); 
		budget.add("transportation"); 
		budget.add("utility"); 
		budget.add("rent"); 
		budget.add("miscellneous"); 
		System.out.println("HashSet: " + budget); 
		System.out.println("HashSet size: " + budget.size());  // HashSet size: 6
        
		budget.add("rent"); 
		budget.add("miscellneous"); 
		
		System.out.println("HashSet: " + budget); 
		System.out.println("HashSet size: " + budget.size()); //HashSet size: 6
		
		budget.add("rent1"); 
		budget.add("miscellneous1"); 
		
		System.out.println("HashSet: " + budget); 
		// let's sort this HashSet by values first
		System.out.println("HashSet size: " + budget.size()); //HashSet size: 8
		
		budget.add( null); 
		budget.add( null); 
		
		System.out.println("HashSet before sorting: " + budget); 
		// let's sort this HashSet by values first
		System.out.println("HashSet size: " + budget.size()); // HashSet size: 9
		

	}

}
