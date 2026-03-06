package src1.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"Bkashy","Science",10000.0,"Male"));
		empList.add(new Employee(2,"Anil","Arts",20000.0,"Female"));
		empList.add(new Employee(3,"Sunil","Science",10000.0,"Male"));
		empList.add(new Employee(4,"Rajesh","Arts",20000.0,"Female"));
		empList.add(new Employee(5,"Suresh","Science",10000.0,"Male"));
		empList.add(new Employee(6,"Ramesh","Arts",20000.0,"Female"));
		
		Comparator<Employee> comp= Comparator.comparing(Employee::getEmpName).thenComparing(Employee::getDept);
		empList.sort(comp);
		System.out.println("Sorted based on enp name and dept="+empList);
		
		Double average = empList.stream()  
                .collect(Collectors.averagingDouble(p->p.salary));  
      System.out.println("Average Salary is: "+average); 
      

		Double average1 = empList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();  
              
    System.out.println("Average Salary is: "+average1); 
		
		 Map<String,Double> avgSalaryOfEmpByGenderList = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		 System.out.println("Average Salary Of Emp By Genderis: "+avgSalaryOfEmpByGenderList); 
		 
		 Map<String,Long> countOfEmpByGenderList = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		 System.out.println("Count Of Emp By Gender is: "+countOfEmpByGenderList);
		 
		Predicate<Employee> p=e->e.salary<11000;
		Function<Employee, Employee> f= e-> {
			e.salary=e.salary+(e.salary*10/100);
			return e;
		};
		List<Employee> increamentEmpList = new ArrayList<Employee>();
		for(Employee e:empList)
		{
			if(p.test(e))
			{
				f.apply(e);
				increamentEmpList.add(e);
			}
		}
		System.out.println("All Emp="+empList);
		System.out.println("Increament Emp List="+increamentEmpList);
		
		//Collections.sort(empList);
		
		Employee e1=new Employee(6,"Ramesh","Arts",20000.0,"Female");
		Employee e2=new Employee(6,"Ramesh","Arts",20000.0,"Female");
		System.out.println(e1.equals(e2));
		
		HashSet<Employee> set=new HashSet<>();
		set.add(e1);
		set.add(e2);
		System.out.println("hashset size="+set.size()); // 2
		
		TreeSet<Employee> set1=new TreeSet<>();
		set1.add(e1);
		set1.add(e2);
		System.out.println("treeset size="+set1.size()); // get exception
	}

}
