package src1.test;
import java.util.HashSet;
import java.util.Set;

class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Getters and setters

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return rollNumber == student.rollNumber;
    }

    public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public int hashCode() {
        return Integer.hashCode(rollNumber);
    }
}

public class EqualsAndHashCodeDemo {
    public static void main(String[] args) {
        // Creating some Student objects
        Student student1 = new Student(101, "John");
        Student student2 = new Student(102, "Alice");
        Student student3 = new Student(101, "John"); // Duplicate rollNumber

        // Using a HashSet to store Students
        Set<Student> studentsSet = new HashSet<>();
        studentsSet.add(student1);
        studentsSet.add(student2);
        studentsSet.add(student3); // This will not be added as it's a duplicate based on rollNumber

        // Displaying the contents of the HashSet
        for (Student student : studentsSet) {
            System.out.println(student.getRollNumber() + " - " + student.getName());
        }
    }
}
