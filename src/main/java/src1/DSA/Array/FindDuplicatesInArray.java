package src1.DSA.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
/*Input: arr[] = [2,3,1,2,3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array. */
public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,3,1,2,3}; //
		duplicates(arr);
	}

		 public static ArrayList<Integer> duplicates(int[] arr) {
		        // code here
		        //2 3 1
		        HashMap<Integer,Integer> hm=new HashMap<>();
		        //put , get , ContainsKey
		        //process each and every element
		        //check wheather the element present in Map or not
		        //if yes get actual freq+1
		        //if no just place aginest 1
		        
		        for(Integer i: arr){
		            if(hm.containsKey(i)){
		                int actfreq=hm.get(i);
		                actfreq++;
		                hm.put(i,actfreq);
		            }else{
		                hm.put(i,1);
		            }
		        }
		        ArrayList<Integer> al=new ArrayList<>();
		        for(Map.Entry<Integer,Integer> me: hm.entrySet()){
		            if(me.getValue()>1){
		                al.add(me.getKey());
		            }
		        }
		        if(al.size()==0)
		        {
		            al.add(-1);
		            return al;
		        }
		        else{
		            Collections.sort(al);
		            return al;
		        }
	    }
}
