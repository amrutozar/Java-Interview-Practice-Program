package src1.DSA.Array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 3, 4, 5, 5, 6 }; //

		for (int i = 0; i < arr.length; i++) {
			if (i + 1 != arr[i]) {
				arr[i] = i + 1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); // [1,2,3,4,5,6,7,8]
		}
		/*
		 * int[] arr1 = { 1,3,3,5,5,7 }; for(int i=0;i<arr1.length;i++) {
		 * if(arr1[i+1]!=arr1[i]) { arr1[i]=arr1[i+1]; } } for (int i = 0; i <
		 * arr1.length; i++) { System.out.println(arr1[i]); // [1,2,3,4,5,6,7,8] }
		 */
	}
	
}
