package src1.StringProgram;

import java.util.stream.Collectors;

public class ToggleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="WrOld";
		
		String toggleString=	str.chars().mapToObj(w->(char)w).map(x->Character.isUpperCase(x)?Character.toLowerCase(x): 
				Character.toUpperCase(x)).map(String::valueOf).
			collect(Collectors.joining());
		System.out.println(toggleString);
	}

}
