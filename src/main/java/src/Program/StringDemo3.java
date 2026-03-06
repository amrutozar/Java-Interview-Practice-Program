package src.Program;

public class StringDemo3 {

	public static void main(String[] args) {
	     demo(null);
	}
	public static void demo(Object o) {
	System.out.println("Object method");
	}
	public static void demo(String s) {
	System.out.println("String method");
	}
}
// output : String method
//Java will choose which overloaded method to call based on the most specific applicable method. Since null can match both Object and String (because String is a subclass of Object), Java picks the most specific type, which is String.
