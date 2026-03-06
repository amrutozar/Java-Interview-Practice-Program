package src.Program;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringDemo2 obj=new StringDemo2();
		obj.fun("abc");
	}
  public void fun(Object o)
  {
	  System.out.print("obj=" + o);
  }
  public void fun(String o)
  {
	  System.out.print("String obj=" + o);
  }
  public void fun(StringBuilder o)
  {
	  System.out.print("StringBuilder obj=" + o);
  }
}
// output: String obj=abc