package src1.test1;

import java.util.HashMap;

public class A {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();

		hm.put("A",1);
		hm.put("B",1);
		hm.put("C",6);
		hm.put("A",2);
		System.out.println("hm="+hm);
	}
	 @Override
	  public boolean equals(Object obj)
		{  
	          return true;
		}
}
