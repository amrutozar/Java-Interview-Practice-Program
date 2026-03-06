package src1.test;
import java.util.Optional;

public class NullCheckExample {

    public static void main(String[] args) {
        Employee e = null; // Assume e is an Employee object
        
        try {
            Optional.ofNullable(e)
                    .orElseThrow(() -> new NullPointerException("Employee is null"))
                    .getSalary();
        } catch (NullPointerException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }
}


