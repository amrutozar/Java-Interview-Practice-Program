package src.Program;

class AA{  
protected void msg(){System.out.println("Parent Hello java");}  
}  
  
public class InheritanceTest6 extends AA{  

//void msg(){System.out.println("child Hello java");} //to override same method in protected same visibility scope required

 public static void main(String args[]){  
	 InheritanceTest6 obj=new InheritanceTest6();  
   obj.msg();  
   }  
}