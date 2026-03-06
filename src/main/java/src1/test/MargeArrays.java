package src1.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MargeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = { 10, 20, 30, 40 }; 
        int[] b = { 50, 60, 70, 80 }; 
        
        int[] c=new int [a.length+b.length];
        
        System.arraycopy(a, 0, c, 0, a.length);
       System.arraycopy(b, 0, c, a.length, b.length);
        System.out.println("new Array=");
        for(int i=0;i<c.length;i++)
        {
        System.out.print(" "+c[i]);
        }
        System.out.println("\nnew Array="+Arrays.toString(c));
        
        int[] margedArray=IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        
        System.out.println("marged Array="+Arrays.toString(margedArray));
	}

}
