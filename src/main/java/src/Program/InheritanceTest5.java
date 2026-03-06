package src.Program;

class A5
{
	//private
	protected
 void test ()
	{
	System.out.println("A5 default method");
	}

 A5() {
	// TODO Auto-generated method stub
   }
  
}
class B5 extends A5
{
  public
	 void test ()
	{
	System.out.println("B5 public method");
	}

 B5() {
	// TODO Auto-generated constructor stub
    }
}

public class InheritanceTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  A5 a = new B5();
		  a.test();
	}
}
// output: B5 public method
