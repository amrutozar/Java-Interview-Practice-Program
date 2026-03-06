package src1.test;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<String, String> bp= new BiPredicate<String, String>() {
			
			@Override
			public boolean test(String str1, String str2) {
				// TODO Auto-generated method stub
				return str1.equals(str2);
			}
		};
    System.out.println("Bipredicates=="+bp.test("madam", "madam"));
    
    BiPredicate<String, String> bp1=(x,y)->x.equals(y);
    
    System.out.println("Bipredicates=="+bp1.test("madam", "madam"));
    
    BiPredicate<String, String> bp2=(x,y)->x.length()==y.length();
    
   boolean output= bp1.and(bp2).test("madam", "madam");
   System.out.println("output="+output);
   
	}

}
