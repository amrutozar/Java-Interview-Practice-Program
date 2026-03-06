package src.Program;

class A1
{
 public 
  void Test1()
	{
	System.out.println("super class test()");
	}

}
class B10 extends A10
{
 public 
  
 void Test2()
	{
	System.out.println("sub class test()");
	}
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  A10 a = new B10();
	//	  a.Test1();
	//	  a.Test2(); //getting the error 
	}

}
