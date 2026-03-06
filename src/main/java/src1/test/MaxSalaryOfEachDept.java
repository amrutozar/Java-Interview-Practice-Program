package src1.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxSalaryOfEachDept {

	public static void main(String[] args) {
		 List<Employee> employees = Arrays.asList(
	                new Employee("John", "IT", 50000.0),
	                new Employee("Alice", "HR", 60000.0),
	                new Employee("Bob", "IT", 70000.0),
	                new Employee("Jane", "Finance", 80000.0),
	                new Employee("Charlie", "HR", 75000.0),
	                new Employee("David", "Finance", 90000.0)
	        );
	Map<String, Optional<Employee>>	higestSalByDept= employees.stream().collect(Collectors.groupingBy(Employee::getDept,
			Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
	
	higestSalByDept.forEach((dept,optEmp)->System.out.println("Dept="+dept+" max salary="+optEmp.get().getSalary()));
	
	employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))))
	.forEach((dept,minSal)->System.out.println("Dept="+dept+" Min salary="+minSal));;
	
	employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)))
	.forEach((dept,avgSal)->System.out.println("Dept="+dept+" Avg salary="+avgSal));;
	
	employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.summarizingDouble(Employee::getSalary)))
	.forEach((dept,sumSal)->System.out.println("Dept="+dept+" Summary salary="+sumSal));;
	
	employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.summingDouble(Employee::getSalary)))
	.forEach((dept,sumSal)->System.out.println("Dept="+dept+" Sum salary="+sumSal));;
	
	
	}

}
