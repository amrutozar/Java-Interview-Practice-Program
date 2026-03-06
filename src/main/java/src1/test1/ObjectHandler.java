package src1.test1;

public class ObjectHandler<T> {

	/*   // Specify the allowed types (e.g., Integer, String, Double)
    public <T extends Number> void acceptNumber(T obj) {
        System.out.println("Accepted a Number: " + obj);
    }

    // Another method to accept String
    public void acceptString(String obj) {
        System.out.println("Accepted a String: " + obj);
    }
    */
 // Specify the allowed types (e.g., Integer, String, Double)
    public <Employee1,EmployeeDTO> void acceptEmployeeAndAddress(T obj) {
        System.out.println("Accepted a Number: " + obj);
    }
}

