package src1.test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
	
	public static List<Employee> getEmployeeList()
	{
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"Bkashy","Science",10000.0,"Male"));
		empList.add(new Employee(2,"Anil","Arts",20000.0,"Female"));
		empList.add(new Employee(3,"Sunil","Science",10000.0,"Male"));
		empList.add(new Employee(4,"Rajesh","Arts",20000.0,"Female"));
		empList.add(new Employee(5,"Suresh","Science",10000.0,"Male"));
		empList.add(new Employee(6,"Ramesh","Arts",20000.0,"Female"));
		
		return empList;
	}

}
