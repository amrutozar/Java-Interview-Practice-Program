package src1.test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeHierarchy {

	public static void main(String[] args) {
        List<EmployeeDTO> list = new ArrayList<>();

        EmployeeDTO dto1 = new EmployeeDTO(1, 2, "John");
        EmployeeDTO dto2 = new EmployeeDTO(2, null, "Dave");

        list.add(dto1);
        list.add(dto2);

        printHierarchy(list);
    }

    public static void printHierarchy(List<EmployeeDTO> list) {
        // Create a map to hold the parent-child relationships
        Map<Integer, String> employeeMap = new HashMap<>();
        for (EmployeeDTO dto : list) {
            employeeMap.put(dto.id, dto.name);
        }

        // Print the parent-child relationships
        for (EmployeeDTO dto : list) {
            String parentName = (dto.parentId != null) ? employeeMap.get(dto.parentId) : "null";
            System.out.println(dto.name + " " + parentName);
        }
    }

}
