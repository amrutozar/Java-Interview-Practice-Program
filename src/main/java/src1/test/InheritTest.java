package src1.test;

public class InheritTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var parent = new Parent();
        var child = new Child();
        System.out.println(parent.HelloWorld());
        System.out.println(child.HelloWorld());
        System.out.println(child.GoodbyeWorld("Amrut"));
	}

}
