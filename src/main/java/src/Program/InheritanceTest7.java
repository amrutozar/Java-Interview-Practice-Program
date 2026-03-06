package src.Program;

class Base4 {
    public Base4() {
        System.out.println("Base");
    }
}
class Derived extends Base4 {

    public Derived() {
        System.out.println("Derived");
    }
}
class DeriDerived extends Derived {
    public DeriDerived() {
        System.out.println("DeriDerived");
    }
}
public class InheritanceTest7 {

	public static void main(String[] args) {
		Derived b = new DeriDerived();
	}

}

/* output: Base
Derived
DeriDerived */