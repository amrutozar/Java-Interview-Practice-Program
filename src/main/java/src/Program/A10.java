package src.Program;

import java.util.Objects;

public class A10 {

	String a;
	public A10(String string) {
		this.a=string;
	}
	public A10() {
	}
	@Override
	public int hashCode() {
		return Objects.hash(a);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A10 other = (A10) obj;
		return Objects.equals(a, other.a);
	}

	
}
