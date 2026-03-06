package src1.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1, 11, 22 ,33 ,11, 11 ,4);
		List<Integer> list1=Arrays.asList(2, 12, 22 ,33 ,14, 11 ,4);
		System.out.println("Asending Sort List in stream =");
		List<Integer> asendingSortList=list.stream().distinct().sorted().toList();
		System.out.println(asendingSortList);
		
		System.out.println("Desending Sort List in stream=");
		List<Integer> desendingSortList=list.stream().distinct().sorted(Comparator.reverseOrder()).toList();
		System.out.println(desendingSortList);
		
		System.out.println("Asending Sort List using Collections.sort()=");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("Asending Sort List using Collections.sort()=");
		list1.sort(Comparator.naturalOrder());
		System.out.println(list1);
		
		System.out.println("Desending Sort List using Collections.sort()=");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		System.out.println("Desending Sort List using Collections.sort()=");
		list1.sort(Collections.reverseOrder());
		System.out.println(list1);
		
		System.out.println("To reverse List using Collections.reverse()=");
		Collections.reverse(list1);
		System.out.println(list1);
		System.out.println("--------------------------------------------------------------------------");
		  // Create a list of employees
        List<Employee> employees = EmployeeDatabase.getEmployeeList();
        Comparator<Employee> comp= Comparator.comparing(Employee::getEmpName).thenComparing(Employee::getDept);
        employees.sort(comp);
        System.out.println("Asending Sorted based on enp name and dept using sort()="+employees);
        
        employees.sort(comp.reversed());
        System.out.println("Descending Sorted based on enp name and dept using sort()="+employees);
        
		System.out.println("Asending Sorted based on enp name in stream =");
		
		employees.stream().sorted(Comparator.comparing(Employee::getEmpName)).forEach(System.out::println);
		
		System.out.println("Desending Sorted based on enp name in stream =");
		employees.stream().sorted(Comparator.comparing(Employee::getEmpName).reversed()).forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------------------------");
	}

}
