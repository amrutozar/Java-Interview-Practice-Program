package src1.test;

import java.util.List;

public class Test15 {
	// Remove duplicate objects from student list objects using java 8 

	public static void main(String[] args) {
		List<Student3> list=List.of(new Student3("ram","pune"),new Student3("ram","pune"),new Student3("laxmina","mumbai"));
		List<Student3> namelist1=list.stream().distinct().toList();
		System.out.println("namelist1="+namelist1);
	}

}
