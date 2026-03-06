package src.Program;

public class StaticDemo {
    int instanceVar = 10;
    static int staticVar = 20;

    static {
        // This is a static block
        System.out.println("Inside static block");
        // You cannot directly access instanceVar here
        // System.out.println(instanceVar); // Compile error
        System.out.println(staticVar); // This is allowed
    }

    public static void main(String[] args) {
        StaticDemo example = new StaticDemo(); // Create an instance
        System.out.println(example.instanceVar); // Now you can access instanceVar
        System.out.println(staticVar); // You can access staticVar directly
        example.test();
    }
    
    public void test()
    {
    	 System.out.println(staticVar); // This is allowed
    }
}
/* Inside static block
20
10
20
20  */
