package src1.test1;

import java.util.List;

public class Persion1 {
	String first_name;
	String last_name;
	String address;
	Integer age;
	List<Persion1> neighbours;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<Persion1> getNeighbours() {
		return neighbours;
	}
	public void setNeighbours(List<Persion1> neighbours) {
		this.neighbours = neighbours;
	}
	public Persion1(String first_name, String last_name, String address, Integer age, List<Persion1> neighbours) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.age = age;
		this.neighbours = neighbours;
	}
	@Override
	public String toString() {
		return "Persion1 [first_name=" + first_name + ", last_name=" + last_name + ", address=" + address + ", age="
				+ age + ", neighbours=" + neighbours + "]";
	}
	public Persion1(String first_name, String last_name, String address, Integer age) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.age = age;
	}
	
}
