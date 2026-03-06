package src.Interface;

public interface Interface1 {
	
	void fun1();
	default void fun2()
	{
		System.out.println("hello");
	}

}
