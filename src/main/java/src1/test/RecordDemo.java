package src1.test;

public class RecordDemo {
	public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);
        System.out.println(person.firstName()); // Accessing properties using accessor methods
        System.out.println(person); // Automatically generated toString method
        
        // Pattern matching example
        if (person instanceof Person p && p.age() >= 18) {
            System.out.println(person.firstName() + " is an adult.");
        } else {
            System.out.println( person.firstName() + " is a minor.");
        }
    }
}
