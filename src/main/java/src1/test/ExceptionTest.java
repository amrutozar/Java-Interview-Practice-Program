package src1.test;

public class ExceptionTest {
		  
	    public static void main(String[] args) {  
	        try  
	        {  
	        int data=50/0; //may throw exception   
	        }
	            //handling the exception  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }catch(Exception e)  
	        {
	        	System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  
	    }  
	      
}
