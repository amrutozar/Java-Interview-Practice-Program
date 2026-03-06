package src.Program;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer>map=new HashMap<>();
		map.put(null,1);
		map.put(null,2);
		map.put(null,3);
		
		System.out.println("map="+map); //output : map={null=3}

		System.out.println("map size="+map.size()); //output : map size=1
		
		map.put("a",null);
		map.put("b",null);
		map.put("c",null);
		
		System.out.println("map="+map); //output : map={null=3, a=null, b=null, c=null}

		System.out.println("map size="+map.size()); //output : map size=4

	}

}
