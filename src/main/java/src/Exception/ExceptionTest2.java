package src.Exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		try{
		    int b=0;
		    int i = a/b;
		    System.out.println("try block executed");
		}
		finally{
		    System.out.println("finally block executed");
		}
	}
}
/* output
finally block executed
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at JavaOCJP/Exception.ExceptionTest2.main(ExceptionTest2.java:10)
	
	try block required catch or finally block
 */