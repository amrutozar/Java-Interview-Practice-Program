package src.Program;

class Animal{
	/*
	 * Animal() {}
	 */
	private boolean domesticOrWild;
	public Animal(boolean domesticOrWild){
		this.domesticOrWild = domesticOrWild;
	}
	protected void method1(){}	
}
/*
public class Dog extends Animal{

	private String breed;
	public Dog(String breed){
	//	super(true);  //need to call super class constructor 
		this.breed = breed;
	}
	public void method1(){}
	
	public static void main(String args[]){
		Dog dog1 = new Dog("Beagle"); // Dog and Animal
		Animal a1 = dog1;
		a1.method1();
	}
}
*/