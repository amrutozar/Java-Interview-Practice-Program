package src1.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ClosestPointsToOrigin1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[][] list= {{1,2}, {3,5}, {-1,1}, {7,9}};
          
          int[][] closest=  function1(list,2);
	}

	private static int[][] function1(int[][] list, int s) {
          Map<Double,Values> map=new HashMap<>();
            for(int i=0;i<list.length;i++)
            {
            	
            double dis=	Math.sqrt(list[i][0]*list[i][0]+list[i][1]*list[i][1]);
            map.put(dis, new Values(list[i][0],list[i][1]));
            
            }
            LinkedHashMap<Double,Values> map1=    map.entrySet().stream().sorted(Map.Entry.comparingByKey()).limit(s).
            collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(x,y)->y,LinkedHashMap::new));
          System.out.println("sorted map="+map1);
		return null;
	}

}
