package src.Exception;

class Overloading
{
 public 
	void sum(String str1,String str2)
	{
	System.out.println("void="+str1+str2);
	}
   /* int sum(String str1,String str2) //overloaded method not allowed 
	{
	System.out.println("void="+str1+str2);
	} */
     int sum(int str1,int str2) 
	{
    	 try {
    		 int a=str1/str2;
    	 }catch (Exception e) {
			System.out.println("Eception in super class");
		}
	System.out.println("int="+(str1+str2));
	return str1+str2;
	}
}
class OverRiding extends Overloading
{
 public 
 /*	String sum(String str1,String str2) //overriding method not allowed 
	{
	System.out.println("OverRiding="+str1+str2);
	return str1+str2;
	} */
  
     int sum(int str1,int str2)
	{
	 try {
		 int a=str1/str2;
	 }catch (Exception e) {
		System.out.println("Eception in sub class");
	}
	System.out.println("OverRiding="+(str1+str2));
	return str1+str2;
	}
}

public class OverRIdingAndOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj=new Overloading();
		obj.sum(10, 0);
		
		OverRiding obj1=new OverRiding();
		obj1.sum(10, 0);
		
		Overloading obj2=new OverRiding();
		obj2.sum(10, 0);
	}

}
