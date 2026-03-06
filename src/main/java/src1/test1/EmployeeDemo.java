package src1.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDemo {

	public static void main(String[] args) {

		List<Employee1> empList = getEmployees();
		
		
	long count=	empList.stream().flatMap(e->e.getAddressList().stream()).filter(addr->addr.isPerment==true).count();
	System.out.println("count="+count);
	
	Map<Boolean,Long> map=	empList.stream().flatMap(e->e.getAddressList().stream()).collect(Collectors.groupingBy(Address::getIsPerment,Collectors.counting()));
	System.out.println("map="+map);
	}
	private static List<Employee1> getEmployees() {
		List<Employee1> empList = new ArrayList<>();
		empList.add(new Employee1(1,"Bkashy","Science",10000.0,"Male",List.of(new Address(true,"pune"))));
		empList.add(new Employee1(2,"Anil","Arts",20000.0,"Female",List.of(new Address(false,"nagar"))));
		empList.add(new Employee1(3,"Sunil","Science",10000.0,"Male",List.of(new Address(true,"beed"))));
		empList.add(new Employee1(4,"Rajesh","Arts",20000.0,"Female",List.of(new Address(true,"pune"),new Address(false,"beed"))));
		empList.add(new Employee1(5,"Suresh","Science",10000.0,"Male",List.of(new Address(true,"pune"),new Address(false,"barshi"))));
		empList.add(new Employee1(6,"Ramesh","Arts",20000.0,"Female",List.of(new Address(true,"pune"),new Address(false,"mumbai"))));
		return empList;
	}

}
