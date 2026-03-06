package src1.test1;

import java.util.List;

public class ObjectHandlerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectHandler obj=new ObjectHandler();
		
		obj.acceptEmployeeAndAddress(new Employee1(1,"Bkashy","Science",10000.0,"Male",
				List.of(new Address(true,"pune"))));
		obj.acceptEmployeeAndAddress(new EmployeeDTO(1, 2, "John"));
		obj.acceptEmployeeAndAddress("amit");
	}

}
