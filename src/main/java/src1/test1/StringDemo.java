package src1.test1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> inputList=List.of("1,2,3","4,5,6");
		
		String result = inputList.stream()
                .flatMap(str -> Arrays.stream(str.split(",")))  // Split and flatten the stream
                .collect(Collectors.joining(","));  // Join the results with commas

        System.out.println(result);  // Output: 1,2,3,4,5,6

       Optional<?> op1=  Optional.ofNullable(null);
        
        System.out.println("op1=="+op1); // Empty Optional
        
        Optional<?> op=  Optional.of(null);
        
        System.out.println("op=="+op.isEmpty());  // Throws NullPointerException
        
       
	}

}
