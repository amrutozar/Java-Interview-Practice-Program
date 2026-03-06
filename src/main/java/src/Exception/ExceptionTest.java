package src.Exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans= test();
		System.out.println("ANS="+ans);
	}

	private static int test() {
		int a=10;
		try{
		    int b=0;
		    int i = a/b;
		    return 10;
		}catch(Exception e){
		    return 20;
		}finally{
		    return 30;
		}
	}

}
// out Put== ANS=30