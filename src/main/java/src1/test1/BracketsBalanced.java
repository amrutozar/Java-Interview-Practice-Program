package src1.test1;

import java.util.Stack;

public class BracketsBalanced {
	  public static boolean areBracketsBalanced(String exp) {
	        // Create a stack to hold opening brackets
	        Stack<Character> stack = new Stack<>();

	        // Iterate over the characters in the expression
	        for (int i = 0; i < exp.length(); i++) {
	            char ch = exp.charAt(i);

	            // If the current character is an opening bracket, push it to the stack
	            if (ch == '(' || ch == '[' || ch == '{') {
	                stack.push(ch);
	            } 
	            // If the current character is a closing bracket
	            else if (ch == ')' || ch == ']' || ch == '}') {
	                // If stack is empty, it means there is no matching opening bracket
	                if (stack.isEmpty()) {
	                    return false;
	                }

	                // Pop the top element from the stack and check if it matches the closing bracket
	                char top = stack.pop();
	                if ((ch == ')' && top != '(') || 
	                    (ch == ']' && top != '[') || 
	                    (ch == '}' && top != '{')) {
	                    return false;
	                }
	            }
	        }

	        // If the stack is empty, the brackets are balanced
	        return stack.isEmpty();
	    }

	    public static void main(String[] args) {
	      //  String exp = "[(])";
	        String exp = "[()]";
	        
	        if (areBracketsBalanced(exp)) {
	            System.out.println("The expression has balanced brackets.");
	        } else {
	            System.out.println("The expression does not have balanced brackets.");
	        }
	    }
}
