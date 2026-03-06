package src1.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeListToMap {

	public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = EmployeeDatabase.getEmployeeList();

        // Convert list to map with employee ID as the key and Employee object as the value
        Map<Integer, Employee> employeeMap = employees.stream()
                .collect(Collectors.toMap(Employee::getEmpId, emp -> emp));

        // Print the map
        employeeMap.forEach((id, emp) -> System.out.println(id + " -> " + emp));
        
        List.of(1,2,3,4,5).stream().collect(Collectors.toMap(x->x,x->((x-1)+(x+1)))).entrySet().stream().
        forEach(System.out::print);
    }
}
