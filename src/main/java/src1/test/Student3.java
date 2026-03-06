package src1.test;

import java.util.Objects;

public class Student3 {

	String name;
	String addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Student3(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student3 [name=" + name + ", addr=" + addr + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(addr, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student3 other = (Student3) obj;
		return Objects.equals(addr, other.addr) && Objects.equals(name, other.name);
	}
	
	
	
}
