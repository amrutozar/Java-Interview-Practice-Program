package src1.test;

import java.util.List;
import java.util.Scanner;

public class FirstAndLastDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int firstDigit = findFirstDigit(number);
        int lastDigit = findLastDigit(number);

        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
        // second way
        int n = 34356;
        String s = Integer.toString(n);
        int first_digit = s.charAt(0)- '0';
        int last_digit = s.charAt(s.length() - 1) - '0';
        System.out.println("First digit of " + n + " is " + first_digit);
        System.out.println("Last digit of " + n + " is " + last_digit);
        
		List<Integer> list=List.of(10,15,8,49,25,98,32,106);
				
		List<Integer> startWithOne=list.stream().filter(x->String.valueOf(x).startsWith("1")).toList();
				
		System.out.println("startWithOne ="+startWithOne);
				
		int sum=list.stream().filter(x->String.valueOf(x).startsWith("1")).mapToInt(Integer::intValue).sum();
			
		System.out.println(sum);
		
		// find numbers who have 1 in second position
		List<Integer> list1=List.of(10,215,8,429,25,918,32,2106);
		System.out.println("Numbers who have 1 in second position=");
		for(int num:list1)
		{
			int temp=num;
			while (num >= 100) {
				num /= 10;
	        }
			if(num%10==1)
			{
				System.out.print(" "+temp);
			}
		}
    }

    public static int findFirstDigit(long number) {
        while (number >= 10) {
            number /= 10;
        }
        return (int) number;
    }

    public static int findLastDigit(long number) {
        return (int) (number % 10);
    }
}
