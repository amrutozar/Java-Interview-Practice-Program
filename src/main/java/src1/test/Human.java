package src1.test;

import java.util.Objects;

public class Human {
	
	Integer id;
	String Name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Human(Integer id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	@Override
	public String toString() {
		return "Human [id=" + id + ", Name=" + Name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Name, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return Objects.equals(Name, other.Name) && Objects.equals(id, other.id);
	}
	
	
}
