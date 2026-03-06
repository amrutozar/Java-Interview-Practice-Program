package src.Exception;

import java.io.IOException;
class A {
void m1() throws Exception {
  System.out.println("In m1 A");
}
}
class B extends A {
void m1() throws Exception { //overridden method must be same as in super class 
  System.out.println("In m1 B");
}
  void m2()
	{
		System.out.println("In m2 B");
	}
}
public class ExceptionTest3 {
public static void main(String[] args) {
  A a=new B();
  try {
  // a.m2();  // super class methods call only the super class methods  
	  a.m1();
  } catch (Exception e) {
   e.printStackTrace();
  }
}
}