package src1.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"Bkashy","Science",10000.0,"Male"));
		empList.add(new Employee(2,"Anil","Arts",20000.0,"Female"));
		empList.add(new Employee(3,"Sunil","Science",30000.0,"Male"));
		empList.add(new Employee(4,"Rajesh","Arts",40000.0,"Female"));
		empList.add(new Employee(5,"Suresh","Science",20000.0,"Male"));
		empList.add(new Employee(6,"Ramesh","Arts",60000.0,"Female"));
		empList.add(new Employee(7,"Rajesh1","Arts",40000.0,"Female"));
		empList.add(new Employee(8,"Suresh1","Science",20000.0,"Male"));
		empList.add(new Employee(9,"Ramesh1","Arts",60000.0,"Female"));
		
		empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).entrySet().stream()
	    .forEach(s -> System.out.println(s));; 
	    
	    empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))).entrySet().stream()
	    .forEach(s -> System.out.println(s));;
	    
	    empList.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.toList())).entrySet().stream()
	    .forEach(s -> System.out.println(s));;
	
	   Double sum= empList.stream().mapToDouble(Employee::getSalary).sum();
	   System.out.println("sum="+sum);
	   
	   Double sum1=empList.stream().filter(x-> x.Dept.equals("Arts")).mapToDouble(Employee::getSalary).sum();
	   System.out.println("sum1="+sum1);
	   
	   Double avg=empList.stream().filter(x-> x.Dept.equals("Arts")).mapToDouble(Employee::getSalary).average().getAsDouble();
	   System.out.println("avg="+avg);
	   
	  	Comparator<Employee> com=Comparator.comparing(Employee::getSalary).reversed();
		Optional<Employee> d=empList.stream().sorted(com).findFirst(); 
		System.out.println("Highest Salary="+d.get());
		
		Optional<Entry<Double, List<Employee>>> d1= empList.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.toList())).
				entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey())).skip(1).findFirst();
		System.out.println("Second Highest Salary="+d1.get());
		System.out.println("=======================================IN CSV Form");
		System.out.println(empList.stream().map(e->e.salary.toString()).collect(Collectors.joining(",")));
		
		empList.stream().map(e->e.empName+","+e.salary).forEach(System.out::println);
		 
	}

}
