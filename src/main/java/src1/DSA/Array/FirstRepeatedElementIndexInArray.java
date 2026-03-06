package src1.DSA.Array;

import java.util.HashMap;

public class FirstRepeatedElementIndexInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,3,1,2,3}; //
		System.out.println(firstRepeated(arr));
	}
	 // Function to return the position(index) of the first repeating element.
    public static int firstRepeated(int[] arr) {
        // Your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int x=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(hm.containsKey(arr[i])){
                x=i+1;
            }else{
                hm.put(arr[i],1);
            }
        }
        return x;
    }
}
