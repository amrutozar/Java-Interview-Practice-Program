package src.Exception;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		try{
		    int b=0;
		    int i = a/b;
		    System.out.println("try block executed");
		}catch(Exception e){
		    System.out.println("Catch block executed");
		}finally{
		    System.out.println("finally block executed");
		}
	}
}
/* outPut
Catch block executed
finally block executed */
