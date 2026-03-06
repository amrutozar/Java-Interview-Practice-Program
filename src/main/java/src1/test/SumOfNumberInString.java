package src1.test;

public class SumOfNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Ka123thik54ey2n72";
		String initialValue = "0";
		int total = 0;
		for(int i=0;i<str.length();i++){

            if(Character.isAlphabetic(str.charAt(i))){

                if(Integer.parseInt(initialValue)!=0) {

                    total=Integer.parseInt(initialValue)+total;

                }
                initialValue="0";

            }else {

                initialValue=initialValue+Character.toString(str.charAt(i));

            }
        }

        System.err.println(total+Integer.parseInt(initialValue));
	}

}
