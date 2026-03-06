package src.Program;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s3 = "abc";
		String s4 = "abc";
		System.out.println("s3 == s4 is:" + s3 == s4); //false
		System.out.println("s3 == s4 is: " + (s3 == s4)); //true
		
		String s1 = "Java";  
		String s2 = "Java";  
		String s5 = new String("Java").intern(); 
		StringBuilder sb1 = new StringBuilder();  
		sb1.append("Ja").append("va");  
		System.out.println(s1 == s2);  //true
		System.out.println(s1.equals(s2));  //true
		System.out.println(sb1.toString() == s1);  //false                                                       
		System.out.println(sb1.toString().equals(s1)); //true
		
		System.out.println((s1 == s5)+", String are equal."); // true  
		System.out.println((s2 == s5)+", String are equal."); // true  
	}

}
/*
There is an issue with how the string concatenation and comparison are structured. Specifically, this part of the code:

System.out.println("s3 == s4 is:" + s3 == s4);
is parsed as:

("s3 == s4 is:" + s3) == s4
So, instead of comparing s3 and s4, it first concatenates "s3 == s4 is:" with s3, resulting in the string "s3 == s4 is:abc". Then, it compares this resulting string with s4 using ==, which is not what you intend.

To fix this, you should wrap the comparison in parentheses:

System.out.println("s3 == s4 is: " + (s3 == s4));
This will correctly compare s3 and s4, and since both s3 and s4 refer to the same string literal "abc" in the string pool, the result of s3 == s4 will be true. The output will be:

s3 == s4 is: true */