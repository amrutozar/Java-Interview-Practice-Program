package src1.test;

public class EqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Human h1=new Human(1,"Amrut");
		Human h2=new Human(2,"Amrut");
		
		Human h3=h1;
		
		System.out.println(h1==h2); //false
		System.out.println(h1==h3); //true
		System.out.println(h1.equals(h2)); //false
		System.out.println(h1.equals(h3)); //true
		System.out.println(h2.equals(h3)); //false
		System.out.println("========================================");
		String str1=new String("Amrut");
		String str2=new String("Amrut");
		
		String str3=str1;
		
		System.out.println(str1==str2);//false
		System.out.println(str1==str3);//true
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));//true
		System.out.println(str2.equals(str3));//true
	}

}
