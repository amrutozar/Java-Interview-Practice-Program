package src.Program;

class A
{
 public 
   A(String str1,String str2)
	{
	System.out.println("void="+str1+str2);
	}

 A() {
	// TODO Auto-generated method stub
   }
  
}
class B extends A10
{
 public 
  
      B (int str1,int str2)
	{
	System.out.println("OverRiding="+(str1+str2));
	}

 B() {
	// TODO Auto-generated constructor stub
    }
}

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  A10 a10 = new B();
		  A10 b = new B(13,11);
	}

}
