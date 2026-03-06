package src1.NewJavaProgram;

import java.util.Arrays;

public class StringProgram {

	public static void main(String[] args) {

		//program to count capital words in strings
		String str="MyNameIsRaj";
		
		//str.chars().mapToObj(c->Character.valueOf((char)c)).map(Object::toString()).
		
	   char[] strCharArray=str.toCharArray();
		int count=0;
		for(int i=0;i<strCharArray.length;i++)
		{
			if(strCharArray[i]<='Z' && strCharArray[i]>='A')
			{
				count++;
			}
		}
		System.out.println("count capital words="+count);
		
		long count1=Arrays.asList(str.split("")).stream().filter(words->Character.isUpperCase(words.charAt(0))).count();
		
		System.out.println("count capital words="+count1);
	}

}
